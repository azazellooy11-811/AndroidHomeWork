package com.example.transition

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fifth.*

class FifthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        button5.setOnClickListener{
            val intentGoToMainActivity = Intent(this, MainActivity::class.java)
            startActivity(intentGoToMainActivity)
        }

    }
}
