package com.example.twitterredditclone.data.models

data class Post(
    val id: String = "",
    val authorId: String = "",
    val text: String = "",
    val imageUrl: String? = null,
    val communityId: String? = null,
    val createdAt: Long = System.currentTimeMillis(),
    val likeCount: Int = 0,
    val upvotes: Int = 0,
    val downvotes: Int = 0
)
