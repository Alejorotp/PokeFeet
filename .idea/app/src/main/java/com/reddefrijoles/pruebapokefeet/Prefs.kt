package com.reddefrijoles.pruebapokefeet

import android.content.Context

class Prefs( val context: Context) {

    val SHARED_NAME = "MySharedPrefs"
    val SHARED_KEYS = "MySharedKeys"
    val SHARED_POKEMONS = "MySharedPokemons"
    val SHARED_PREVIOUS_STEPS = "MySharedTotalSteps"
    val SHARED_STEPS = "MySharedSteps"
    val SHARED_GENERO = "MySharedGenero"
    val SHARED_EMAIL = "MySharedEmail"
    val SHARED_USERNAME = "MySharedUsername"


    val storage = context.getSharedPreferences(SHARED_NAME, 0)


    fun saveKeys(value: Int) {
        storage.edit().putInt(SHARED_KEYS, value).apply()
    }

    fun getKeys(): Int {
        return storage.getInt(SHARED_KEYS, 0)
    }

    fun saveSteps(value: Int) {
        storage.edit().putInt(SHARED_STEPS, value).apply()
    }

    fun getSteps(): Int {
        return storage.getInt(SHARED_STEPS, 0)
    }

    fun saveEmail(value: String?) {
        storage.edit().putString(SHARED_EMAIL, value).apply()
    }

    fun getEmail(): String? {
        return storage.getString(SHARED_EMAIL, "None").toString()
    }

    fun savepreviousSteps(value: Int) {
        storage.edit().putInt(SHARED_PREVIOUS_STEPS, value).apply()
    }

    fun getpreviousSteps(): Int {
        return storage.getInt(SHARED_PREVIOUS_STEPS, 0)
    }

    fun savePokemonsDB(value: String) {
        storage.edit().putString(SHARED_POKEMONS, value).apply()
    }

    fun savePokemons(value: String) {
        var pokemons = getPokemonsU()
        pokemons= pokemons +","+ value
        storage.edit().putString(SHARED_POKEMONS, pokemons).apply()
    }

    //val list = stringList.chunked(1).map { it.toInt() }
    fun getPokemonsU(): String? {
        return storage.getString(SHARED_POKEMONS, "0")
    }

    fun getPokemonsList(): MutableList<Int> {
        val pokemons = getPokemonsU()
        val list= pokemons?.split(",")?.map { it.toInt() }!!.toMutableList()
        //val list = pokemons?.chunked(1)?.map { it.toInt() }
        return list!!
    }


    fun eliminarPokemons() {
        storage.edit().putString(SHARED_POKEMONS, "0").apply()
    }

    fun getUserName(): String? {
        return storage.getString(SHARED_USERNAME, "None").toString()
    }

    fun saveUserName(value: String?) {
        storage.edit().putString(SHARED_USERNAME, value).apply()
    }

    fun getGenero(): String? {
        return storage.getString(SHARED_GENERO, "None").toString()
    }

    fun saveGenero(value: String?) {
        storage.edit().putString(SHARED_GENERO, value).apply()
    }
}