package com.azhar.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            //TODO action
            val i = Intent(this, MenuActivity::class.java)
            startActivity(i)
        }

        btnRegister.setOnClickListener {
            val regActivity = Intent(this, RegisterActivity::class.java)
            startActivity(regActivity)
        }
    }

}