package com.example.composeapisample.model.repository

import retrofit2.http.Url

/**
 * ユーザーを表すクラス
 */
data class User(
    val userId: UserId,
    val name: String,
    val avatarImage: NetworkImage,
    val blogUrl: com.example.composeapisample.model.repository.Url,
)
