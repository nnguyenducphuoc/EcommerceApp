package com.example.ecommerceapp.feature_.domain.model

import com.google.gson.annotations.SerializedName

data class NegotiatingPostItem(
    val id: Int,
    val postId: Int,
    val status: String,
    val suggestPrice: Int,
    val suggestUserId: Int
)
