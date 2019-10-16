package com.example.transition

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login_screen.*
import kotlinx.android.synthetic.main.activity_new_password.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.textView).setOnClickListener { v ->
            val intent = Intent(this, NewPasswordActivity::class.java)
            startActivity(intent)
        }
        et_sign_in_pass.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                ti_sign_in_pass.error = null
                ti_sign_in_pass.isErrorEnabled = false
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })
        btn_login.setOnClickListener {
            progressBar.visibility = ProgressBar.VISIBLE
            if (ti_sign_in_pass.editText?.text.toString() == PasswordRepository.password) {
                val intent = Intent(this, NewPasswordActivity::class.java)
                progressBar.visibility = ProgressBar.INVISIBLE
                startActivity(intent)
            } else {
                setPasswordError()
                progressBar.visibility = ProgressBar.INVISIBLE
            }
        }
    }

    private fun setPasswordError() {
        til_newPassword.error = getString(R.string.validate_password)
    }
}

