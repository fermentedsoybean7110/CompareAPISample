package com.example.composeapisample.model.remotedatasource

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Retrofitを用いたGitHub APIのクライアント
 */
interface ApiClient {
    @GET("users/{username}")
    suspend fun getGithubUser(@Path("username") userName: String): Response<GitHubUser>
}