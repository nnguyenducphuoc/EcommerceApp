package com.example.ecommerceapp.feature_.domain.model

import com.google.gson.annotations.SerializedName

data class PostItem (
    val author: Int,
    val category: String,
    val content: String,
    val date: String,
    val description: String,
    val id: Int,
    val price: Int,
    val status: String,
    val thumbnail: String,
    val title: String
)