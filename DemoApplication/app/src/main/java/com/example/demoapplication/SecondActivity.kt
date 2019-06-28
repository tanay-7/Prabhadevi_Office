package com.example.demoapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SecondActivity : AppCompatActivity(), Callback<Person> {
    override fun onFailure(call: Call<Person>, t: Throwable) {
        println()
      }

    override fun onResponse(call: Call<Person>, response: Response<Person>) {
        var person = response.body()
        person?.data
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

       /* var bun: Bundle? = intent.extras
        val co = bun?.getInt("user_count")

        txt_count_view.text = co.toString()*/


        val retrofit = Retrofit.Builder()
            .baseUrl("http://www.mocky.io/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

         val service = retrofit.create(Webservice::class.java)


        service.service.enqueue(this)


    }


}