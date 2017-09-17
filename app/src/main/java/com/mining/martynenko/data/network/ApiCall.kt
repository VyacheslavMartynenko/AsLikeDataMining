package com.mining.martynenko.data.network

import com.mining.martynenko.data.network.model.ApplicationInfoResponse
import io.reactivex.Observable
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

interface ApiCall {
    val ENDPOINT_SEARCH get() = "lookup"

    @GET("lookup")
    fun getApplicationInfo(@Query("id") id: Int): Observable<ApplicationInfoResponse>

    object Factory {
        private val BASE_URL = "https://itunes.apple.com/"
        private val NETWORK_CALL_TIMEOUT = 60

        fun create(): ApiCall {
            val builder = OkHttpClient.Builder()
            builder.readTimeout(NETWORK_CALL_TIMEOUT.toLong(), TimeUnit.SECONDS)
            builder.writeTimeout(NETWORK_CALL_TIMEOUT.toLong(), TimeUnit.SECONDS)
            val httpClient = builder.build()
            val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(httpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
            return retrofit.create(ApiCall::class.java)
        }
    }
}