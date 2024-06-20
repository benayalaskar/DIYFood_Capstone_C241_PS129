package com.example.diyfood.data.retrofit
import  retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.diyfood.data.Api

object RetrofitClient {
    private const val BASE_URL = "https://diyrecom-ikm3r7hutq-et.a.run.app/"

    val instance: Api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(Api::class.java)
    }
}