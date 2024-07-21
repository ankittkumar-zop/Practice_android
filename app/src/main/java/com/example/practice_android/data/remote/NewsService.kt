package com.example.practice_android.data.remote

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

//https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=16f5564804314303bf497943eddfd260

const val baseUrl = "https://newsapi.org/"
const val key = "16f5564804314303bf497943eddfd260"

interface NewsInterface{

    @GET("v2/top-headlines?apiKey=$key")
    fun getNews(@Query("country")country : String, @Query("page")page : Int ) : Call<NewsData>
}


