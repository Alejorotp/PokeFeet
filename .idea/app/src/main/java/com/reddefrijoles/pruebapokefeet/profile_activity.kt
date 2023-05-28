
package com.reddefrijoles.pruebapokefeet

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import com.reddefrijoles.pruebapokefeet.UserApplication.Companion.prefs

class profile_activity : Activity() {


    private var botonProfile: ImageButton? = null
    private val db = FirebaseFirestore.getInstance()
    @SuppressLint("MissingInflatedId")
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        botonProfile = findViewById(R.id.profileOptions)
        val genero = findViewById<TextView>(R.id.Genero)
        val ivpokemon = findViewById<ImageView>(R.id.ivFotoPerfil)
        val pokemons_totales = findViewById<TextView>(R.id.pokemons_totales)
        val pasos_totales = findViewById<TextView>(R.id.pasos_totales)
        val username = findViewById<TextView>(R.id.username)
        val lapicito = findViewById<ImageView>(R.id.lapicito)
        val email = prefs.getEmail()
        val pokemons = prefs.getPokemonsList()
        val steps = prefs.getSteps()
        pasos_totales.text = "Pasos: " + steps.toString()
        pokemons_totales.text = "Pokemons totales: " + (pokemons.size - 1).toString()
        if (pokemons[1] == 4) {
            ivpokemon.setImageResource(R.drawable.charmander_color)
        } else if (pokemons[1] == 1) {
            ivpokemon.setImageResource(R.drawable.bulbasaur_color)
        } else if (pokemons[1] == 7) {
            ivpokemon.setImageResource(R.drawable.squirtle_color)
        }

        if (email != null) {
            db.collection("users").document(email).get().addOnSuccessListener {
                genero.text = "genero: " + (it.get("genero").toString())
                prefs.saveGenero(it.get("genero").toString())
                username.text = (it.get("username").toString())
                prefs.saveUserName(it.get("username").toString())
            }
        }

        lapicito?.setOnClickListener {
            val optionsDialog = Dialog(this)
            optionsDialog.setContentView(R.layout.changeuser)
            optionsDialog.setTitle("Change username")
            optionsDialog.show()

            val etUsername: EditText = optionsDialog.findViewById(R.id.etNewUsername)
            val btChangeUsername: Button = optionsDialog.findViewById(R.id.btnChangeUsername)

            btChangeUsername.setOnClickListener {
                val newUsername = etUsername.text.toString()
                if (newUsername.length > 3) {
                    db.collection("users").document(email!!).update("username", newUsername)
                    username.text = newUsername
                    prefs.saveUserName(newUsername)
                    optionsDialog.dismiss()
                } else {
                    Toast.makeText(this, "El nombre de usuario debe tener mínimo 4 carácteres", Toast.LENGTH_SHORT).show()
                }
            }

        }

        botonProfile?.setOnClickListener {
            finish()
        }


    }
}