package com.reddefrijoles.pruebapokefeet

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.reddefrijoles.pruebapokefeet.UserApplication.Companion.prefs

class loading_page_activity : AppCompatActivity() {
    private var logo_1: ImageView? = null
    private var loading___: TextView? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading_page)
        logo_1 = findViewById<View>(R.id.logo_1) as ImageView
        loading___ = findViewById<View>(R.id.loading___) as TextView
        Handler().postDelayed({
            finish()
        }, 2000)
    }
}