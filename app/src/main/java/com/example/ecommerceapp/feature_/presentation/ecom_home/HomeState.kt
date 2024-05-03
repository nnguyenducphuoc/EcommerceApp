package com.example.ecommerceapp.feature_.presentation.ecom_home

import com.example.ecommerceapp.feature_.domain.model.PostItem

data class HomeState(
    val webItems: List<PostItem> = emptyList(),
    val mobileItems: List<PostItem> = emptyList(),
    val gameItems: List<PostItem> = emptyList(),
    val isLoading: Boolean = true
)
