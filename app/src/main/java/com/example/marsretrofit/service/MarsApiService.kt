package com.example.marsretrofit.service

import MarsModel
import retrofit2.Call
import retrofit2.http.GET

interface MarsApiService {
    @GET("realestate")
    fun getProperties(): Call<List<MarsModel>>
}