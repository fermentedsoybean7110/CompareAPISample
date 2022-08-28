package com.example.composeapisample.model.repository

import retrofit2.http.Url

/**
 * ネットワークから読み込む画像を表すクラス
 */
data class NetworkImage(
    val url: Url,
)
