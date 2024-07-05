package com.example.practice_android

import android.util.Log

open class Rectangle {

    open fun shape (){
//        println(" the shape of rectangle ")
        Log.d("DEBUG" , "this is for rectangle")


    }
}

interface Polygon{
    fun shape(){
//        println(" the shape of polygon")
        Log.d("DEBUG" , "this is for polygon")
    }
}

class common() : Rectangle(), Polygon{
    override fun shape(){
        super<Rectangle>.shape()
        super<Polygon>.shape()
    }
}
