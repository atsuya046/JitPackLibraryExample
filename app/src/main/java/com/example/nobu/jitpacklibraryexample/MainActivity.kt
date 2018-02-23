package com.example.nobu.jitpacklibraryexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.nobu.mylibrary.Hoge
import com.example.nobu.myutil.Fuga

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hoge = Hoge("hoge")
        val fuga = Fuga(1)
    }
}
