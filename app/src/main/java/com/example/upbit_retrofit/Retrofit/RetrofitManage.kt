package com.example.upbit_retrofit.Retrofit

import android.util.Log
import retrofit2.Call
import retrofit2.Callback

class RetrofitManage{
    val TAG = "Retrofit"
    var data : String? = null
    companion object{
        val manager = RetrofitManage()
    }
    private var iRetrofit : IRetrofit? = RetrofitClient.getRetrofit(Resource.BASEURL)?.create(IRetrofit::class.java)

    fun getFund(code : String) : String? {
        val call = iRetrofit?.getPrice(code)
        Log.d(TAG, "onResponse: $data")
        call?.enqueue(object : Callback<Response>{
            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                data = response.body().toString()!!
                Log.d(TAG, "onResponse: $data")
            }
            override fun onFailure(call: Call<Response>, t: Throwable) {
                Log.d(TAG, "onFailure: $t ")
            }

        })
        return data
    }
}