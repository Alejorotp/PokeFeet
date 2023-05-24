package com.reddefrijoles.pruebapokefeet

import android.content.Intent
import android.os.Bundle
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
        val btt : Button = findViewById(R.id.button123)
        btt.setOnClickListener {
            // Cambiar a signup_Activity, solo esta en main menu para ahorrar tiempo en tests
            //TODO cambiar a signup_activity y quitar el saveKeys(0)
            //prefs.saveKeys(0)
            val login = Intent(this, main_menu_activity::class.java)
            startActivity(login)
            finish()
        }

        //custom code goes here
    }
}