package com.example.diyfood.data
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import com.example.diyfood.data.response.PostResponse

interface Api {
    @GET("makanan")
    fun getPosts(): Call<ArrayList<PostResponse>>

    @FormUrlEncoded
    @POST("makanan")
    fun postData(
        @Field("category") category: String,
        @Field("taste") taste: String
    ): Call<PostResponse>
}