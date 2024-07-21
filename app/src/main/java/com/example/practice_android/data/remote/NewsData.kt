package com.example.practice_android.data.remote

import com.example.practice_android.Article

data class NewsData(
    val status :String,
    val totalResults : Int ,
    val articles : List<Article>
)
