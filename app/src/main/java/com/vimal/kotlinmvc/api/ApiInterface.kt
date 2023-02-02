package com.vimal.kotlinmvc.api

import com.vimal.kotlinmvc.model.PixabayResponse
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Query

interface ApiInterface {

    // https://pixabay.com/api/?key=13745654-0d7421681193bbdba054b8959&q=flowers&image_type=photo&pretty=true&per_page=100&page=2

    @GET("/api/?")
    fun getImages(
        @Query(value = "key") key: String,
        @Query(value = "q") q: String,
        @Query(value = "pretty") pretty: Boolean,
        @Query(value = "per_page") per_page: Int,
        @Query(value = "page") page: Int
    ): Call<PixabayResponse>
}