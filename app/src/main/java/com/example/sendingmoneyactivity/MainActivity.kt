package com.example.se766moneyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

        class Money: AppCompatActivity() {
            lateinit var btnMoney: Button

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_moneysend)
                btnMoney=findViewById(R.id.btnMoney)
                btnMoney.setOnClickListener {
                    val intent= Intent(this,MainActivity::class.java)
                    startActivity(intent)

                }
            }
        }
