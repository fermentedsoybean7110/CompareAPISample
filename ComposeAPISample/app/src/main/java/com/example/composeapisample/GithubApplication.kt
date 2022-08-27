package com.example.composeapisample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * 独自のApplicationクラス
 *
 * Hiltの@HiltAndroidAppを付与するために作成
 */

@HiltAndroidApp
class GithubApplication:Application() {

}