package com.doda.nevera.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.doda.nevera.ApiModule
import com.doda.nevera.data.Forecast
import com.doda.nevera.databinding.FragmentHomeBinding
import com.doda.nevera.db.Cities
import com.doda.nevera.viewModels.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ApiModule.initRetrofitVrijeme()

        val city: Cities = Cities(
            id = 1, name = "Zagreb", lat = 45.815399,
            lon = 15.966568, currentTemp = 0.0, hourlyForecast = Forecast(
                date = "danas lal", sat = 0, temp = 0, simbol = "5"
            )
        )

        viewModel.insertCity(city)

        val gradovi: List<Cities>? = viewModel.getCities()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}