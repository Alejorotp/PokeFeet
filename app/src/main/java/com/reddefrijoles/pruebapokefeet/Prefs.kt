package com.reddefrijoles.pruebapokefeet

import android.content.Context

class Prefs( val context: Context) {

    val SHARED_NAME = "MySharedPrefs"
    val SHARED_KEYS = "MySharedKeys"
    val SHARED_current_STEPS = "MySharedcurrentSteps"
    val SHARED_POKEMONS = "MySharedPokemons"
    val SHARED_PREVIOUS_STEPS = "MySharedTotalSteps"
    val SHARED_STEPS = "MySharedSteps"
    val SHARED_ACTIVATED = "MySharedActivated"


    val storage = context.getSharedPreferences(SHARED_NAME, 0)


    fun saveKeys(value: Int) {
        /* val editor = storage.edit()
         editor.putInt(SHARED_KEYS, value)
         editor.apply()*/
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

    fun saveActivated(value: Boolean) {
        storage.edit().putBoolean(SHARED_ACTIVATED, value).apply()
    }

    fun getActivated(): Boolean {
        return storage.getBoolean(SHARED_ACTIVATED, false)
    }

    fun savepreviousSteps(value: Int) {
        storage.edit().putInt(SHARED_PREVIOUS_STEPS, value).apply()
    }

    fun getpreviousSteps(): Int {
        return storage.getInt(SHARED_PREVIOUS_STEPS, 0)
    }

    fun savecurrentSteps(value: Int) {
        storage.edit().putInt(SHARED_current_STEPS, value).apply()
    }

    fun getcurrentSteps(): Int {
        return storage.getInt(SHARED_current_STEPS, 0)
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

    fun getPokemonsList(): List<Int> {
        val pokemons = getPokemonsU()
        val list = pokemons?.split(",")?.map { it.toInt() }
        //val list = pokemons?.chunked(1)?.map { it.toInt() }
        return list!!
    }


    fun eliminarPokemons() {
        storage.edit().putString(SHARED_POKEMONS, "0").apply()
    }

}