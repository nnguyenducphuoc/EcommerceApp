package com.example.ecommerceapp.feature_.domain.use_case

import com.example.ecommerceapp.feature_.domain.model.PostItem
import com.example.ecommerceapp.feature_.domain.repo.EcomListRepo
import javax.inject.Inject

class PostUseCases @Inject constructor(
    private val repo: EcomListRepo
) {

    suspend fun getPostItemsByCategory(): PostUseCaseResult {
        val webPosts = repo.getAllPostsByCategory("Web Development")
        val mobilePosts = repo.getAllPostsByCategory("Mobile Development")
        val gamePosts = repo.getAllPostsByCategory("Game Development")

        return if (webPosts.isEmpty() || mobilePosts.isEmpty() || gamePosts.isEmpty()) {
            PostUseCaseResult.Error("No Data")
        } else {
            PostUseCaseResult.Success(
                webPosts,
                mobilePosts,
                gamePosts
            )
        }
    }
}

sealed class PostUseCaseResult {
    data class Success(
        val webItems: List<PostItem>,
        val mobileItems: List<PostItem>,
        val gameItems: List<PostItem>
    ) : PostUseCaseResult()
    data class Error(val message: String) : PostUseCaseResult()
}