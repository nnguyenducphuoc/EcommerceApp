package com.example.ecommerceapp.feature_.data.remote.dto

import com.google.gson.annotations.SerializedName

data class RemoteNegotiatingPostDtoItem(
    @SerializedName("id")
    val id: Int,
    @SerializedName("post_id")
    val postId: Int,
    @SerializedName("status")
    val status: String,
    @SerializedName("suggest_price")
    val suggestPrice: Int,
    @SerializedName("suggest_user_id")
    val suggestUserId: Int
)