package com.example.marsretrofit.service

import com.example.marsretrofit.model.MarsModel
import retrofit2.Call
import retrofit2.http.GET

/**
 * Mars api service
 *
 * @constructor Create empty Mars api service
 *
 * Request thrown to get data from API
 */
interface MarsApiService {
    @GET("realestate")
    fun getProperties(): Call<List<MarsModel>>
}