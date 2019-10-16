package com.example.transition

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_new_password.*

class NewPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et_newPassword.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                til_newPassword.error = null
                til_newPassword.isErrorEnabled = false
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })
        btn_savePassword.setOnClickListener {
            if (til_newPassword.editText?.text.toString() != "") {
                PasswordRepository.password = til_newPassword.editText?.text.toString()
                onBackPressed()
            }
            else {
                setPasswordError()
            }
        }
    }

    private fun setPasswordError() {
        til_newPassword.error = getString(R.string.enter)
    }
}
