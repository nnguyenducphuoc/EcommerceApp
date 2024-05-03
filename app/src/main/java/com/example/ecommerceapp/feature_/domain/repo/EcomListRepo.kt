package com.example.ecommerceapp.feature_.domain.repo

import com.example.ecommerceapp.feature_.domain.model.PostItem

interface EcomListRepo {
    suspend fun getAllPosts(): List<PostItem>
    suspend fun getAllPostsByCategory(category: String): List<PostItem>
}