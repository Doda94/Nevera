package com.doda.nevera

import com.doda.nevera.api.VrijemeApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

object ApiModule {
    // Define your base URLs
    private const val BASE_URL_1 = "https://vrijeme.hr/"
    private const val BASE_URL_2 = "https://prognoza.hr/"
    private const val BASE_URL_3 = "https://meteo.hr/"

    lateinit var retrofitVrijeme: VrijemeApiService

    fun initRetrofitVrijeme() {
        val okhttp = OkHttpClient.Builder().addInterceptor(
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        )
            .build()

        retrofitVrijeme = Retrofit.Builder()
            .baseUrl(BASE_URL_1)
            .addConverterFactory(SimpleXmlConverterFactory.create())
//            .addConverterFactory(Json { ignoreUnknownKeys = true }.asConverterFactory("application/json".toMediaType()))
            .client(okhttp)
            .build()
            .create(VrijemeApiService::class.java)

    }

    // Provide API service for each base URL
    //    val service2Api: Service2Api = provideRetrofit(BASE_URL_2).create(Service2Api::class.java)
    //    val service3Api: Service3Api = provideRetrofit(BASE_URL_3).create(Service3Api::class.java)
}