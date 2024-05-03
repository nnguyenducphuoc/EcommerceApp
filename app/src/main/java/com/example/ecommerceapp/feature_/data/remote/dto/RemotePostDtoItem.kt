package com.example.ecommerceapp.feature_.data.remote.dto

import com.google.gson.annotations.SerializedName

data class RemotePostDtoItem(
    @SerializedName("author")
    val author: Int,
    @SerializedName("category")
    val category: String,
    @SerializedName("content")
    val content: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("price")
    val price: Int,
    @SerializedName("status")
    val status: String,
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("title")
    val title: String
)