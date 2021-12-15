package com.example.myfirtskmm.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.myfirtskmm.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        val btnVisibility: Button = findViewById(R.id.btnChangeVisibility)

        btnVisibility.setOnClickListener(View.OnClickListener {
            if(tv.visibility == View.GONE){
                tv.visibility = View.VISIBLE
            }else if(tv.visibility == View.VISIBLE){
                tv.visibility = View.GONE
            }
        })
    }
}
