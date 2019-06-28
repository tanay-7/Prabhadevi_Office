package com.example.demoapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var countColor = 0
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_next.setOnClickListener {
            var intent_pass_count = Intent(this, SecondActivity::class.java)

            intent_pass_count.putExtra("user_count",count)
            startActivity(intent_pass_count)
        }
    }

    fun countPlus(view: View) {
        var countBox = txt_count.text
//        var countBox = findViewById<TextView>(R.id.txt_count).text
        count = Integer.parseInt(countBox.toString())
        count++
        txt_count.text = count.toString()

        var arr = arrayOf(R.color.colorAccent, R.color.colorPrimary, R.color.colorPrimaryDark)

        countColor++
        if (countColor >= 2)
            countColor = 0

        constraintLayout1.setBackgroundColor(ContextCompat.getColor(this, arr[countColor]))
    }


}
