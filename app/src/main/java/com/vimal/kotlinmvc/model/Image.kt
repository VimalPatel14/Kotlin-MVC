package com.vimal.kotlinmvc.model

import com.google.gson.annotations.SerializedName

class Image {
    @SerializedName("previewURL")
    private val thumbnailUrl: String? = null

    @SerializedName("webformatHeight")
    private val imageWidth: Int? = null

    @SerializedName("webformatWidth")
    private val imageHeight: Int? = null

    @SerializedName("pageURL")
    private val reddirectUrl: String? = null

    @SerializedName("webformatURL")
    private val previewImage: String? = null

    fun getThumbnail(): String?
    {
        return thumbnailUrl
    }
}
