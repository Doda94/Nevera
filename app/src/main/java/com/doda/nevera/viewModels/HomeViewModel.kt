package com.doda.nevera.viewModels

import androidx.activity.result.launch
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.doda.nevera.db.Cities
import com.doda.nevera.db.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val weatherRepository: WeatherRepository
) : ViewModel() {

    private val _cities = MutableLiveData<List<Cities>?>()

    val cities: LiveData<List<Cities>?>
        get() = _cities

    init {
        viewModelScope.launch {
            _cities.value = getAllCities()
        }
    }

    //TODO add UI elements if city list is empty, e.g. there is no internet connection
    fun getCities(): List<Cities>? {
        return _cities.value
    }

    fun insertCity(city: Cities) {
        viewModelScope.launch(Dispatchers.IO) {
            weatherRepository.insertCity(city)
            _cities.postValue(getAllCities()) // Use postValue for background threads
        }
    }

    private suspend fun getAllCities(): List<Cities> {
        return weatherRepository.getAllCities()
    }

}