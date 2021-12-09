package com.informatika19100093.projectandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_relative_layout.setOnClickListener {
            val i = Intent(this, ActivityRelativeLayout::class.java)
            startActivity(i)
        }
    }
}