package com.example.demoapplication

import retrofit2.Call
import retrofit2.http.GET

interface Webservice {

    @get:GET("5cee8f8b300000f7796e9ca1")
    val service: Call<Person>


//    fun myservice("5cee8f8b300000f7796e9ca1") : Call<Person>
}
