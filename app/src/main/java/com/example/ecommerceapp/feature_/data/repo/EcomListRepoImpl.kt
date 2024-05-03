package com.example.ecommerceapp.feature_.data.repo

import com.example.ecommerceapp.feature_.data.mapper.toPostItemListFromRemote
import com.example.ecommerceapp.feature_.data.remote.EcomApi
import com.example.ecommerceapp.feature_.domain.model.PostItem
import com.example.ecommerceapp.feature_.domain.repo.EcomListRepo

class EcomListRepoImpl(
    private val api: EcomApi
): EcomListRepo {
    override suspend fun getAllPosts(): List<PostItem> {
        return api.getAllPost().toPostItemListFromRemote()
    }

    override suspend fun getAllPostsByCategory(category: String): List<PostItem> {
        return api.getAllPost().filter {
            it.category == category
        }.toPostItemListFromRemote()
    }
}