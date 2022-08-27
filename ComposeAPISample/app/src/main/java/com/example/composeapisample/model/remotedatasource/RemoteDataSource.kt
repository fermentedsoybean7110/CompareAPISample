package com.example.composeapisample.model.remotedatasource

/**
 * サーバーからのレスポンスを取り出すData Source
 */
interface RemoteDataSource {

    /**
     * サーバーからのレスポンスを[GitHubUser]として返す
     */
    suspend fun getGitHubUser(userName: String): GitHubUser
}