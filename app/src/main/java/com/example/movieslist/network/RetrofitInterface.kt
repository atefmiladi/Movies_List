package com.example.movieslist.network

import com.example.movieslist.utils.Constant
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInterface {
    
    private val retrofit by lazy {

        Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    val apiInterface : ApiInterface by lazy { retrofit.create(ApiInterface::class.java) }

}