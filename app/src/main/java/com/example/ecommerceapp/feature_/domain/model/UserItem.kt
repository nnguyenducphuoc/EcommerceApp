package com.example.ecommerceapp.feature_.domain.model

import com.google.gson.annotations.SerializedName

data class UserItem(
    val id: Int,
    val name: String,
    val passWord: String,
    val phone: String,
    val type: String,
    val userName: String
)