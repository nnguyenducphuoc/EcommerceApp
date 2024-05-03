package com.example.ecommerceapp.feature_.data.remote
import com.example.ecommerceapp.feature_.data.remote.dto.RemotePostDtoItem
import retrofit2.http.GET
interface EcomApi {
    @GET("post.json")
    suspend fun getAllPost(): List<RemotePostDtoItem>
}