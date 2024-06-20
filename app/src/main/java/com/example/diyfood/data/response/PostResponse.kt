package com.example.diyfood.data.response

import com.google.gson.annotations.SerializedName

data class PostResponse(

	@field:SerializedName("PostResponse")
	val postResponse: List<ResponseItem?>? = null
)

data class ResponseItem(

	@field:SerializedName("foto")
	val foto: String? = null,

	@field:SerializedName("Makanan")
	val makanan: String? = null,

	@field:SerializedName("kategori")
	val kategori: String? = null,

	@field:SerializedName("similarity_score")
	val similarityScore: Any? = null,

	@field:SerializedName("deskripsi_rasa")
	val deskripsiRasa: String? = null
)
