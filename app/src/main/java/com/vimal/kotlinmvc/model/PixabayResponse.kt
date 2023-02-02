package com.vimal.kotlinmvc.model

import com.google.gson.annotations.SerializedName

class PixabayResponse {
    @SerializedName("totalHits")
    private val totalHits: Int? = 0


    @SerializedName("hits")
    private val images: ArrayList<Image>? = null

    fun getTotalHits(): Int? {
        return totalHits;
    }

    fun getImages(): ArrayList<Image>? {
        return images;
    }
}