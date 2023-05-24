package com.reddefrijoles.pruebapokefeet

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.reddefrijoles.pruebapokefeet.UserApplication.Companion.prefs

class shop_activity : Activity() {
    private var botonShop: ImageButton? = null
    private var botonLlave: ImageButton? = null
    private var keycount:TextView? = null
    private var comprarCofreAgua: ImageButton? = null
    private var totalPokemons: Int = 151
    private var botonFrenesi: ImageButton? = null
    lateinit var comprarCofreFuego: ImageButton
    lateinit var comprarCofrePlanta: ImageButton
    lateinit var comprarCofreElectrico: ImageButton
    lateinit var comprarCofreRey: ImageButton

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shop)
        keycount = findViewById(R.id.keycountshop)
        comprarCofreAgua = findViewById(R.id.btn_comprar_agua)
        botonShop= findViewById(R.id.ibShop)
        botonLlave= findViewById(R.id.llaveButton)
        botonFrenesi = findViewById(R.id.frenesi)
        comprarCofreFuego = findViewById(R.id.btn_comprar_fuego)
        comprarCofrePlanta = findViewById(R.id.btn_comprar_planta)
        comprarCofreElectrico = findViewById(R.id.btn_comprar_electrico)
        comprarCofreRey = findViewById(R.id.btn_comprar_rey)

        botonFrenesi?.setOnClickListener {
            //haremos que la imagen gire
            val angulo = 360 * 10
            val animation = android.view.animation.RotateAnimation(0f, angulo.toFloat(), 50f, 50f)
            animation.duration = 5000
            animation.fillAfter = true
            botonFrenesi?.startAnimation(animation)
        }

        keycount?.text = prefs.getKeys().toString()
        botonShop?.setOnClickListener {
            finish()
        }

        comprarCofreAgua?.setOnClickListener {
            comprarPokemons("Agua")

        }
        comprarCofreFuego.setOnClickListener {
            comprarPokemons("Fuego")
        }
        comprarCofrePlanta.setOnClickListener {
            comprarPokemons("Planta")
        }
        comprarCofreElectrico.setOnClickListener {
            comprarPokemons("Eléctrico")
        }
        comprarCofreRey.setOnClickListener {
            comprarPokemons("Rey")
        }

        botonLlave?.setOnClickListener {
            val pasosPorLlave = 50
            var steps : Int = prefs.getSteps()
            var keys : Int = prefs.getKeys()
            val keysBought = steps / pasosPorLlave
            keys+=keysBought
            val spentSteps = keysBought*pasosPorLlave
            prefs.saveKeys(keys)
            prefs.saveSteps(steps-spentSteps)
            Toast.makeText(this, "Hay $steps pasos, se gastaron $spentSteps y consiguio $keysBought", Toast.LENGTH_SHORT).show()
            keycount?.text = prefs.getKeys().toString()
        }

    }
    fun mostrarPokemon(id: Int) {
        val PokemonDialog = Dialog(this)
        PokemonDialog.setContentView(R.layout.pokemon_card)
        PokemonDialog.setTitle("Pokemon Card")
        PokemonDialog.show()
        val pokemons = Constants.getPokemons()

        val pokemon = pokemons.get(id - 1)
        val tvnombre = PokemonDialog.findViewById<TextView>(R.id.tvNombre)
        val ivFoto = PokemonDialog.findViewById<ImageView>(R.id.ivFoto)
        val tvType1 = PokemonDialog.findViewById<TextView>(R.id.tvTipo1)
        val tvType2 = PokemonDialog.findViewById<TextView>(R.id.tvTipo2)
        val tvId = PokemonDialog.findViewById<TextView>(R.id.tvId)
        val tvCategory = PokemonDialog.findViewById<TextView>(R.id.tvCategoria)
        val tvAltura = PokemonDialog.findViewById<TextView>(R.id.tvAltura)
        val tvPeso = PokemonDialog.findViewById<TextView>(R.id.tvPeso)
        val tvDescripcion = PokemonDialog.findViewById<TextView>(R.id.tvDescripcion)
        val vtipo1 = PokemonDialog.findViewById<View>(R.id.vTipo1)
        val vtipo2 = PokemonDialog.findViewById<View>(R.id.vTipo2)

        tvnombre.text = pokemon.nombre
        ivFoto.setImageResource(pokemon.imagenColor)
        tvType1.text = pokemon.tipo1
        vtipo1.setBackgroundColor(pokemon.imagenTipo1)
        tvType2.text = pokemon.tipo2
        vtipo2.setBackgroundColor(pokemon.imagenTipo2)
        tvId.text = pokemon.id.toString()
        tvCategory.text = pokemon.categoria
        tvAltura.text = pokemon.altura
        tvPeso.text = pokemon.peso
        tvDescripcion.text = pokemon.descripcion
    }

    fun comprarPokemons (tipo: String){
        var pokemon = prefs.getPokemonsList()
        var num = pokemon[0]
        var keys : Int = prefs.getKeys()
        if(keys == 0){
            Toast.makeText(this, "No tienes llaves", Toast.LENGTH_SHORT).show()
            return
        }
        if(pokemon.size == totalPokemons+1){
            Toast.makeText(this, "Ya tienes todos los pokemons", Toast.LENGTH_SHORT).show()
            return
        }
        if(!revisarPosibleCompra(tipo)){
            Toast.makeText(this, "No hay  mas pokemons de ese tipo", Toast.LENGTH_SHORT).show()
            return
        }
        keys--
        prefs.saveKeys(keys)
        keycount?.text = prefs.getKeys().toString()

        while(pokemon.contains(num) || !pokemonTipoBoolean(tipo, num)){
            num = (1..totalPokemons).random()
        }
        mostrarPokemon(num)
        prefs.savePokemons(num.toString())
    }

    fun pokemonTipoBoolean(tipo: String, id: Int): Boolean {
        if(id==0){
            return false
        }
        if(tipo == "Rey"){
            return true
        }
        val pokemons = Constants.getPokemons()
        val pokemon = pokemons[id - 1]
        if (tipo == pokemon.tipo1 || tipo == pokemon.tipo2) {
            return true
        }
        
        return false
    }

    fun revisarPosibleCompra(tipo: String): Boolean {
        var pokemon = prefs.getPokemonsList()
        for (i in 1..totalPokemons){
            if(!pokemon.contains(i) && pokemonTipoBoolean(tipo, i)){
                return true
            }
        }
        return false
    }

}