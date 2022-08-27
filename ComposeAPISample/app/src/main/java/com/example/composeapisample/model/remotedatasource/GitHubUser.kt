package com.example.composeapisample.model.remotedatasource

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * GitHub APIからのレスポンス
 */
@Serializable
data class GitHubUser(
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
    @SerialName("avatar_url") val avatarUrl: String,
    @SerialName("blog") val blog: String,
)