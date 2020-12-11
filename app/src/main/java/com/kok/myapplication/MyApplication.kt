package com.kok.myapplication

import android.app.Application
import coil.ImageLoader
import coil.ImageLoaderFactory
import coil.util.CoilUtils
import okhttp3.OkHttpClient
import java.net.Proxy

/**
 * Author:CASE
 * Date:2020-12-11
 * Time:10:17
 */
class MyApplication : Application(), ImageLoaderFactory {
  override fun newImageLoader(): ImageLoader {
    return ImageLoader.Builder(applicationContext)
        .crossfade(true)
        .okHttpClient {
          OkHttpClient.Builder()
              .proxy(Proxy.NO_PROXY)
              .cache(CoilUtils.createDefaultCache(applicationContext))
              .build()
        }
        .build()
  }
}