package com.abhi.mylib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhi.toasty.Toasty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*show toast from lib*/
        Toasty.showToast(this@MainActivity,"Hi , this is my first library")
    }
}