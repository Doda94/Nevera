package com.doda.nevera

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.doda.nevera.databinding.FragmentHomeBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

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
        ApiModule.retrofitVrijeme.getVrijemeHrvatska().enqueue(object : Callback<HrvatskaResponse> {
            override fun onResponse(call: Call<HrvatskaResponse>, response: Response<HrvatskaResponse>) {
                if (response.isSuccessful) {
                    val vrijemeHrvatska = response.body()

                }
            }

            override fun onFailure(call: Call<HrvatskaResponse>, t: Throwable) {

            }
        })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}