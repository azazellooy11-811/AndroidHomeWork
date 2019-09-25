package com.example.transition

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        button4.setOnClickListener{
            val intentGoToFifthActivity = Intent(this, FifthActivity::class.java)
            startActivity(intentGoToFifthActivity)
        }
    }
}
