package com.example.composeapisample.model.remotedatasource

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import kotlinx.serialization.ExperimentalSerializationApi
import javax.inject.Singleton

/**
 * [ApiClient]のModule
 */

@Module
@InstallIn
class ApiClientModule {

    /**
     * [ApiClient]のDIに用いられるインスタンスを生成する
     */
    @ExperimentalSerializationApi
    @Provides
    @Singleton
    fun provideApiClient(apiClientProvider: ApiClientProvider): ApiClient {
        return apiClientProvider.provide()
    }
}