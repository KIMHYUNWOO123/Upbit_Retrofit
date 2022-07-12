package com.example.upbit_retrofit.Retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IRetrofit {

    @GET("/v1/crix/candles/lines")
    fun getPrice(
        @Query("code")  code : String
    ): Call<Response>
}