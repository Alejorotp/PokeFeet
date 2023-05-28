/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		signup
	 *	@date 		Friday 07th of April 2023 06:20:13 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
package com.reddefrijoles.pruebapokefeet

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.reddefrijoles.pruebapokefeet.UserApplication.Companion.prefs
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.firestore.FirebaseFirestore

class signup_activity : Activity() {
    private var girlButton: ImageButton? = null
    private var boyButton: ImageButton? = null
    private var otroButton: ImageButton? = null
    private var bulbasaurButton: ImageButton? = null
    private var charmanderButton: ImageButton? = null
    private var squirtleButton: ImageButton? = null
    private lateinit var etNombre: EditText
    private lateinit var etPassword: EditText
    private var selectedGenero: ImageButton? = null
    private var selectedPokemon: ImageButton? = null
    private var genero: String? = null
    private var pokemon: String? = null
    private var idpokemon: String? = null
    private var btnRegistrar: Button? = null

    private val db = FirebaseFirestore.getInstance()

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)
        girlButton = findViewById(R.id.trainergirl)
        boyButton = findViewById(R.id.trainerboy)
        otroButton = findViewById(R.id.ibOtro)
        bulbasaurButton = findViewById(R.id.ibBulbasaur)
        charmanderButton = findViewById(R.id.ibCharmander)
        squirtleButton = findViewById(R.id.ibSquirtle)
        etNombre = findViewById(R.id.etNombreSU)
        etPassword = findViewById(R.id.etContrasenaSU)
        btnRegistrar = findViewById(R.id.btRegistrar)

        boyButton?.setOnClickListener {
            if (it !== selectedGenero) {
                selectedGenero?.setBackgroundResource(R.drawable.notselected)
                selectedGenero = it as ImageButton
                genero = selectedGenero?.tag.toString()

                selectedGenero?.setBackgroundResource(R.drawable.rectangle_1_shape)
            }
        }
        girlButton?.setOnClickListener {
            if (it !== selectedGenero) {
                selectedGenero?.setBackgroundResource(R.drawable.notselected)
                selectedGenero = it as ImageButton
                genero = selectedGenero?.tag.toString()

                selectedGenero?.setBackgroundResource(R.drawable.rectangle_1_shape)
            }
        }
        otroButton?.setOnClickListener {
            if (it !== selectedGenero) {
                selectedGenero?.setBackgroundResource(R.drawable.notselected)
                selectedGenero = it as ImageButton
                genero = selectedGenero?.tag.toString()

                selectedGenero?.setBackgroundResource(R.drawable.rectangle_1_shape)
            }
        }

        charmanderButton?.setOnClickListener {
            if (it !== selectedPokemon) {
                selectedPokemon?.setBackgroundResource(R.drawable.notselected)
                selectedPokemon = it as ImageButton
                pokemon = selectedPokemon?.tag.toString()
                idpokemon = "4"

                selectedPokemon?.setBackgroundResource(R.drawable.rectangle_1_shape)
            }
        }
        bulbasaurButton?.setOnClickListener {
            if (it !== selectedPokemon) {
                selectedPokemon?.setBackgroundResource(R.drawable.notselected)
                selectedPokemon = it as ImageButton
                pokemon = selectedPokemon?.tag.toString()
                idpokemon = "1"

                selectedPokemon?.setBackgroundResource(R.drawable.rectangle_1_shape)
            }
        }
        squirtleButton?.setOnClickListener {
            if (it !== selectedPokemon) {
                selectedPokemon?.setBackgroundResource(R.drawable.notselected)
                selectedPokemon = it as ImageButton
                pokemon = selectedPokemon?.tag.toString()
                idpokemon = "7"

                selectedPokemon?.setBackgroundResource(R.drawable.rectangle_1_shape)
            }
        }
        btnRegistrar?.setOnClickListener {
            var email = etNombre.text.toString()
            var password = etPassword.text.toString()

            if (!email.isEmpty() && !password.isEmpty() && genero != null && pokemon != null) {
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            prefs.saveEmail(email)
                            prefs.saveUserName(email)
                            db.collection("users").document(email).set(
                                hashMapOf(
                                    "username" to email,
                                    "genero" to genero,
                                    "pokemons" to "0,$idpokemon",
                                    "steps" to 0,
                                    "keys" to 0
                                )
                            )
                            prefs.savePokemons("$idpokemon")
                            showHome(task.result?.user?.email ?: "", ProviderType.EMAIL)
                        } else {
                            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                                .addOnCompleteListener {
                                    if (it.isSuccessful) {
                                        prefs.saveEmail(email)
                                        prefs.saveUserName(email)
                                        var steps = 0
                                        var keys = 0
                                        var pokemons = ""
                                        db.collection("users").document(email).get().addOnSuccessListener {
                                            steps = it.get("steps").toString().toInt()
                                            prefs.saveSteps(steps)
                                            keys = it.get("keys").toString().toInt()
                                            prefs.saveKeys(keys)
                                            pokemons = it.get("pokemons").toString()
                                            prefs.savePokemonsDB(pokemons)
                                        }
                                        showHome(it.result?.user?.email ?: "", ProviderType.EMAIL)
                                    } else {
                                        showAlert()
                                    }
                                }
                        }
                    }

            } else {
                Toast.makeText(this, "Ingrese un nombre y una contraseña", Toast.LENGTH_LONG).show()
            }

            /*if(!email.isEmpty() && !password.isEmpty()){
                FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful){
                        Toast.makeText(this,"successfull login", Toast.LENGTH_SHORT).show()
                        showHome(it.result?.user?.email ?:"", ProviderType.EMAIL)
                    }else{
                        showAlert()
                    }
                }
            }else{
                Toast.makeText(this,"Fields can't be empty", Toast.LENGTH_SHORT).show()
            }

             */

// keeps session open with prefs


        }


    }

    // keeps session open with prefs
    fun showHome(email: String, provider: ProviderType) {
        val homeIntent = Intent(this, main_menu_activity::class.java).apply {
            putExtra("email", email)
            putExtra("provider", provider.name)
        }
        startActivity(homeIntent)
        finish()
    }

    // Exception alert
    fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Error al Autenticar")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    // prefs to keep session open
    private fun Session() {
        val Prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE)
        val email = Prefs.getString("email", null)
        val provider = Prefs.getString("provider", null)

        if (email != null && provider != null) {
            showHome(email, ProviderType.valueOf(provider))
        }

    }


}