package com.example.ecommerceapp.feature_.data.mapper

import com.example.ecommerceapp.feature_.data.remote.dto.RemotePostDtoItem
import com.example.ecommerceapp.feature_.domain.model.PostItem

fun RemotePostDtoItem.toPostItem(): PostItem {
    return PostItem(
        author, category, content, date, description, id, price, status, thumbnail, title
    )
}

fun List<RemotePostDtoItem>.toPostItemListFromRemote(): List<PostItem> {
    return this.map { post ->
        PostItem(
            author = post.author,
            category = post.category,
            content = post.content,
            date = post.date,
            description = post.description,
            id = post.id,
            price = post.price,
            status = post.status,
            thumbnail = post.thumbnail,
            title = post.title
        )
    }
}

