package com.doda.nevera.api

import retrofit2.Call
import retrofit2.http.GET

interface VrijemeApiService {

    @GET("hrvatska_n.xml")
    fun getVrijemeHrvatska(): Call<HrvatskaResponse>

    @GET("europa_n.xml")
    fun getVrijemeEuropa(): Call<HrvatskaResponse>

}