package com.abhi.toasty

import android.content.Context
import android.widget.Toast

object Toasty {
    fun showToast(context :Context , message :String) {
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }
}