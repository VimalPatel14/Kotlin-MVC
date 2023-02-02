package com.vimal.kotlinmvc.controller

import android.content.Context
import android.util.Log
import com.vimal.kotlinmvc.MainActivity
import com.vimal.kotlinmvc.api.ApiClient
import com.vimal.kotlinmvc.api.ApiInterface
import com.vimal.kotlinmvc.model.PixabayResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ImageListPresenter (var context: Context, var view: MainActivity) {

    fun fetchImages() {


        val apiService = ApiClient.client!!.create(ApiInterface::class.java)
        val call = apiService.getImages(
            "13745654-0d7421681193bbdba054b8959",
            "flowers",
            true,
            100,
            1
        )

        call.enqueue(object : Callback<PixabayResponse> {
            override fun onResponse(
                call: Call<PixabayResponse>,
                response: Response<PixabayResponse>
            ) {
                response.body()?.getImages()?.let { view.setValues(it) }
                Log.e("Result", response.body()?.getImages()?.size.toString())

            }

            override fun onFailure(call: Call<PixabayResponse>, t: Throwable) {
                view.setError(t.message.toString())
            }
        })
    }
}