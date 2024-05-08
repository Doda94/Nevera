package com.doda.nevera

import retrofit2.Call
import retrofit2.http.GET

interface VrijemeApiService {

    @GET("hrvatska_n")
    fun getVrijemeHrvatska(): Call<HrvatskaResponse>
}