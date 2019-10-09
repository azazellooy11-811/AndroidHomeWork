package com.example.transition

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        button3.setOnClickListener{
            val intentGoToFourthActivity = Intent(this, FourthActivity::class.java)
            startActivity(intentGoToFourthActivity)
        }
    }
}
