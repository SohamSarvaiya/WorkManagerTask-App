package com.scode.workmanagertaskapp.data

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface FileApi {

    @GET("/wp-content/uploads/2020/02/SpectorSite_21-scaled.jpg")
    suspend fun downloadImage(): Response<ResponseBody>

    companion object {
        val instance by lazy {
            Retrofit.Builder()
                .baseUrl("https://geobarns.com/")
                .build()
                .create(FileApi::class.java)
        }
    }
}