package com.example.ecommerceapp.feature_.data.remote.dto

import com.google.gson.annotations.SerializedName

data class RemoteUserDtoItem(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("pass_word")
    val passWord: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("user_name")
    val userName: String
)