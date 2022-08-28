package com.example.composeapisample.model.repository

import com.example.composeapisample.model.remotedatasource.GitHubUser
import com.example.composeapisample.model.remotedatasource.RemoteDataSource
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
) : UserRepository {
    override suspend fun getUser(userName: String): User {
        return remoteDataSource.getGitHubUser(userName = userName).toUser()
    }

    // [GitHubUser]を[User]に変換する拡張関数
    private fun GitHubUser.toUser() : User {
        return User(
            userId = UserId(value = id),
            name = name,
            avatarImage = NetworkImage(url = Url(value = avatarUrl)),
            blogUrl = Url(value = blog)
        )
    }
}