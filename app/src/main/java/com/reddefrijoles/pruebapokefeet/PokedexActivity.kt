/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		pokedex
	 *	@date 		Sunday 16th of April 2023 04:17:51 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
package com.reddefrijoles.pruebapokefeet

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import android.view.View

import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.reddefrijoles.pruebapokefeet.UserApplication.Companion.prefs
//import com.reddefrijoles.pruebapokefeet.databinding.ActivityMainBinding
//import com.reddefrijoles.pruebapokefeet.databinding.PokedexBinding

class PokedexActivity : AppCompatActivity(), View.OnClickListener {

    //private lateinit var binding: PokedexBinding


    private lateinit var pokemons: ArrayList<Pokemon>
    private lateinit var listPokemon: List<Int>

    //Manera larga
    private lateinit var ibPokemon1: ImageView
    private lateinit var ibPokemon2: ImageView
    private lateinit var ibPokemon3: ImageView
    private lateinit var ibPokemon4: ImageView
    private lateinit var ibPokemon5: ImageView
    private lateinit var ibPokemon6: ImageView
    private lateinit var ibPokemon7: ImageView
    private lateinit var ibPokemon8: ImageView
    private lateinit var ibPokemon9: ImageView
    private lateinit var ibPokemon10: ImageView
    private lateinit var ibPokemon11: ImageView
    private lateinit var ibPokemon12: ImageView
    private lateinit var ibPokemon13: ImageView
    private lateinit var ibPokemon14: ImageView
    private lateinit var ibPokemon15: ImageView
    private lateinit var ibPokemon16: ImageView
    private lateinit var ibPokemon17: ImageView
    private lateinit var ibPokemon18: ImageView
    private lateinit var ibPokemon19: ImageView
    private lateinit var ibPokemon20: ImageView
    private lateinit var ibPokemon21: ImageView
    private lateinit var ibPokemon22: ImageView
    private lateinit var ibPokemon23: ImageView
    private lateinit var ibPokemon24: ImageView
    private lateinit var ibPokemon25: ImageView
    private lateinit var ibPokemon26: ImageView
    private lateinit var ibPokemon27: ImageView
    private lateinit var ibPokemon28: ImageView
    private lateinit var ibPokemon29: ImageView
    private lateinit var ibPokemon30: ImageView
    private lateinit var ibPokemon31: ImageView
    private lateinit var ibPokemon32: ImageView
    private lateinit var ibPokemon33: ImageView
    private lateinit var ibPokemon34: ImageView
    private lateinit var ibPokemon35: ImageView
    private lateinit var ibPokemon36: ImageView
    private lateinit var ibPokemon37: ImageView
    private lateinit var ibPokemon38: ImageView
    private lateinit var ibPokemon39: ImageView
    private lateinit var ibPokemon40: ImageView
    private lateinit var ibPokemon41: ImageView
    private lateinit var ibPokemon42: ImageView
    private lateinit var ibPokemon43: ImageView
    private lateinit var ibPokemon44: ImageView
    private lateinit var ibPokemon45: ImageView
    private lateinit var ibPokemon46: ImageView
    private lateinit var ibPokemon47: ImageView
    private lateinit var ibPokemon48: ImageView
    private lateinit var ibPokemon49: ImageView
    private lateinit var ibPokemon50: ImageView
    private lateinit var ibPokemon51: ImageView
    private lateinit var ibPokemon52: ImageView
    private lateinit var ibPokemon53: ImageView
    private lateinit var ibPokemon54: ImageView
    private lateinit var ibPokemon55: ImageView
    private lateinit var ibPokemon56: ImageView
    private lateinit var ibPokemon57: ImageView
    private lateinit var ibPokemon58: ImageView
    private lateinit var ibPokemon59: ImageView
    private lateinit var ibPokemon60: ImageView
    private lateinit var ibPokemon61: ImageView
    private lateinit var ibPokemon62: ImageView
    private lateinit var ibPokemon63: ImageView
    private lateinit var ibPokemon64: ImageView
    private lateinit var ibPokemon65: ImageView
    private lateinit var ibPokemon66: ImageView
    private lateinit var ibPokemon67: ImageView
    private lateinit var ibPokemon68: ImageView
    private lateinit var ibPokemon69: ImageView
    private lateinit var ibPokemon70: ImageView
    private lateinit var ibPokemon71: ImageView
    private lateinit var ibPokemon72: ImageView
    private lateinit var ibPokemon73: ImageView
    private lateinit var ibPokemon74: ImageView
    private lateinit var ibPokemon75: ImageView
    private lateinit var ibPokemon76: ImageView
    private lateinit var ibPokemon77: ImageView
    private lateinit var ibPokemon78: ImageView
    private lateinit var ibPokemon79: ImageView
    private lateinit var ibPokemon80: ImageView
    private lateinit var ibPokemon81: ImageView
    private lateinit var ibPokemon82: ImageView
    private lateinit var ibPokemon83: ImageView
    private lateinit var ibPokemon84: ImageView
    private lateinit var ibPokemon85: ImageView
    private lateinit var ibPokemon86: ImageView
    private lateinit var ibPokemon87: ImageView
    private lateinit var ibPokemon88: ImageView
    private lateinit var ibPokemon89: ImageView
    private lateinit var ibPokemon90: ImageView
    private lateinit var ibPokemon91: ImageView
    private lateinit var ibPokemon92: ImageView
    private lateinit var ibPokemon93: ImageView
    private lateinit var ibPokemon94: ImageView
    private lateinit var ibPokemon95: ImageView
    private lateinit var ibPokemon96: ImageView
    private lateinit var ibPokemon97: ImageView
    private lateinit var ibPokemon98: ImageView
    private lateinit var ibPokemon99: ImageView
    private lateinit var ibPokemon100: ImageView
    private lateinit var ibPokemon101: ImageView
    private lateinit var ibPokemon102: ImageView
    private lateinit var ibPokemon103: ImageView
    private lateinit var ibPokemon104: ImageView
    private lateinit var ibPokemon105: ImageView
    private lateinit var ibPokemon106: ImageView
    private lateinit var ibPokemon107: ImageView
    private lateinit var ibPokemon108: ImageView
    private lateinit var ibPokemon109: ImageView
    private lateinit var ibPokemon110: ImageView
    private lateinit var ibPokemon111: ImageView
    private lateinit var ibPokemon112: ImageView
    private lateinit var ibPokemon113: ImageView
    private lateinit var ibPokemon114: ImageView
    private lateinit var ibPokemon115: ImageView
    private lateinit var ibPokemon116: ImageView
    private lateinit var ibPokemon117: ImageView
    private lateinit var ibPokemon118: ImageView
    private lateinit var ibPokemon119: ImageView
    private lateinit var ibPokemon120: ImageView
    private lateinit var ibPokemon121: ImageView
    private lateinit var ibPokemon122: ImageView
    private lateinit var ibPokemon123: ImageView
    private lateinit var ibPokemon124: ImageView
    private lateinit var ibPokemon125: ImageView
    private lateinit var ibPokemon126: ImageView
    private lateinit var ibPokemon127: ImageView
    private lateinit var ibPokemon128: ImageView
    private lateinit var ibPokemon129: ImageView
    private lateinit var ibPokemon130: ImageView
    private lateinit var ibPokemon131: ImageView
    private lateinit var ibPokemon132: ImageView
    private lateinit var ibPokemon133: ImageView
    private lateinit var ibPokemon134: ImageView
    private lateinit var ibPokemon135: ImageView
    private lateinit var ibPokemon136: ImageView
    private lateinit var ibPokemon137: ImageView
    private lateinit var ibPokemon138: ImageView
    private lateinit var ibPokemon139: ImageView
    private lateinit var ibPokemon140: ImageView
    private lateinit var ibPokemon141: ImageView
    private lateinit var ibPokemon142: ImageView
    private lateinit var ibPokemon143: ImageView
    private lateinit var ibPokemon144: ImageView
    private lateinit var ibPokemon145: ImageView
    private lateinit var ibPokemon146: ImageView
    private lateinit var ibPokemon147: ImageView
    private lateinit var ibPokemon148: ImageView
    private lateinit var ibPokemon149: ImageView
    private lateinit var ibPokemon150: ImageView
    private lateinit var ibPokemon151: ImageView


    private lateinit var tvPokemon1: TextView
    private lateinit var tvPokemon2: TextView
    private lateinit var tvPokemon3: TextView
    private lateinit var tvPokemon4: TextView
    private lateinit var tvPokemon5: TextView
    private lateinit var tvPokemon6: TextView
    private lateinit var tvPokemon7: TextView
    private lateinit var tvPokemon8: TextView
    private lateinit var tvPokemon9: TextView
    private lateinit var tvPokemon10: TextView
    private lateinit var tvPokemon11: TextView
    private lateinit var tvPokemon12: TextView
    private lateinit var tvPokemon13: TextView
    private lateinit var tvPokemon14: TextView
    private lateinit var tvPokemon15: TextView
    private lateinit var tvPokemon16: TextView
    private lateinit var tvPokemon17: TextView
    private lateinit var tvPokemon18: TextView
    private lateinit var tvPokemon19: TextView
    private lateinit var tvPokemon20: TextView
    private lateinit var tvPokemon21: TextView
    private lateinit var tvPokemon22: TextView
    private lateinit var tvPokemon23: TextView
    private lateinit var tvPokemon24: TextView
    private lateinit var tvPokemon25: TextView
    private lateinit var tvPokemon26: TextView
    private lateinit var tvPokemon27: TextView
    private lateinit var tvPokemon28: TextView
    private lateinit var tvPokemon29: TextView
    private lateinit var tvPokemon30: TextView
    private lateinit var tvPokemon31: TextView
    private lateinit var tvPokemon32: TextView
    private lateinit var tvPokemon33: TextView
    private lateinit var tvPokemon34: TextView
    private lateinit var tvPokemon35: TextView
    private lateinit var tvPokemon36: TextView
    private lateinit var tvPokemon37: TextView
    private lateinit var tvPokemon38: TextView
    private lateinit var tvPokemon39: TextView
    private lateinit var tvPokemon40: TextView
    private lateinit var tvPokemon41: TextView
    private lateinit var tvPokemon42: TextView
    private lateinit var tvPokemon43: TextView
    private lateinit var tvPokemon44: TextView
    private lateinit var tvPokemon45: TextView
    private lateinit var tvPokemon46: TextView
    private lateinit var tvPokemon47: TextView
    private lateinit var tvPokemon48: TextView
    private lateinit var tvPokemon49: TextView
    private lateinit var tvPokemon50: TextView
    private lateinit var tvPokemon51: TextView
    private lateinit var tvPokemon52: TextView
    private lateinit var tvPokemon53: TextView
    private lateinit var tvPokemon54: TextView
    private lateinit var tvPokemon55: TextView
    private lateinit var tvPokemon56: TextView
    private lateinit var tvPokemon57: TextView
    private lateinit var tvPokemon58: TextView
    private lateinit var tvPokemon59: TextView
    private lateinit var tvPokemon60: TextView
    private lateinit var tvPokemon61: TextView
    private lateinit var tvPokemon62: TextView
    private lateinit var tvPokemon63: TextView
    private lateinit var tvPokemon64: TextView
    private lateinit var tvPokemon65: TextView
    private lateinit var tvPokemon66: TextView
    private lateinit var tvPokemon67: TextView
    private lateinit var tvPokemon68: TextView
    private lateinit var tvPokemon69: TextView
    private lateinit var tvPokemon70: TextView
    private lateinit var tvPokemon71: TextView
    private lateinit var tvPokemon72: TextView
    private lateinit var tvPokemon73: TextView
    private lateinit var tvPokemon74: TextView
    private lateinit var tvPokemon75: TextView
    private lateinit var tvPokemon76: TextView
    private lateinit var tvPokemon77: TextView
    private lateinit var tvPokemon78: TextView
    private lateinit var tvPokemon79: TextView
    private lateinit var tvPokemon80: TextView
    private lateinit var tvPokemon81: TextView
    private lateinit var tvPokemon82: TextView
    private lateinit var tvPokemon83: TextView
    private lateinit var tvPokemon84: TextView
    private lateinit var tvPokemon85: TextView
    private lateinit var tvPokemon86: TextView
    private lateinit var tvPokemon87: TextView
    private lateinit var tvPokemon88: TextView
    private lateinit var tvPokemon89: TextView
    private lateinit var tvPokemon90: TextView
    private lateinit var tvPokemon91: TextView
    private lateinit var tvPokemon92: TextView
    private lateinit var tvPokemon93: TextView
    private lateinit var tvPokemon94: TextView
    private lateinit var tvPokemon95: TextView
    private lateinit var tvPokemon96: TextView
    private lateinit var tvPokemon97: TextView
    private lateinit var tvPokemon98: TextView
    private lateinit var tvPokemon99: TextView
    private lateinit var tvPokemon100: TextView
    private lateinit var tvPokemon101: TextView
    private lateinit var tvPokemon102: TextView
    private lateinit var tvPokemon103: TextView
    private lateinit var tvPokemon104: TextView
    private lateinit var tvPokemon105: TextView
    private lateinit var tvPokemon106: TextView
    private lateinit var tvPokemon107: TextView
    private lateinit var tvPokemon108: TextView
    private lateinit var tvPokemon109: TextView
    private lateinit var tvPokemon110: TextView
    private lateinit var tvPokemon111: TextView
    private lateinit var tvPokemon112: TextView
    private lateinit var tvPokemon113: TextView
    private lateinit var tvPokemon114: TextView
    private lateinit var tvPokemon115: TextView
    private lateinit var tvPokemon116: TextView
    private lateinit var tvPokemon117: TextView
    private lateinit var tvPokemon118: TextView
    private lateinit var tvPokemon119: TextView
    private lateinit var tvPokemon120: TextView
    private lateinit var tvPokemon121: TextView
    private lateinit var tvPokemon122: TextView
    private lateinit var tvPokemon123: TextView
    private lateinit var tvPokemon124: TextView
    private lateinit var tvPokemon125: TextView
    private lateinit var tvPokemon126: TextView
    private lateinit var tvPokemon127: TextView
    private lateinit var tvPokemon128: TextView
    private lateinit var tvPokemon129: TextView
    private lateinit var tvPokemon130: TextView
    private lateinit var tvPokemon131: TextView
    private lateinit var tvPokemon132: TextView
    private lateinit var tvPokemon133: TextView
    private lateinit var tvPokemon134: TextView
    private lateinit var tvPokemon135: TextView
    private lateinit var tvPokemon136: TextView
    private lateinit var tvPokemon137: TextView
    private lateinit var tvPokemon138: TextView
    private lateinit var tvPokemon139: TextView
    private lateinit var tvPokemon140: TextView
    private lateinit var tvPokemon141: TextView
    private lateinit var tvPokemon142: TextView
    private lateinit var tvPokemon143: TextView
    private lateinit var tvPokemon144: TextView
    private lateinit var tvPokemon145: TextView
    private lateinit var tvPokemon146: TextView
    private lateinit var tvPokemon147: TextView
    private lateinit var tvPokemon148: TextView
    private lateinit var tvPokemon149: TextView
    private lateinit var tvPokemon150: TextView
    private lateinit var tvPokemon151: TextView

    private lateinit var flechita: ImageButton

    private lateinit var tvNumeroPokemon: TextView
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pokedex)

        //Manera larga
        ibPokemon1 = findViewById(R.id.ibPokemon1)
        ibPokemon2 = findViewById(R.id.ibPokemon2)
        ibPokemon3 = findViewById(R.id.ibPokemon3)
        ibPokemon4 = findViewById(R.id.ibPokemon4)
        ibPokemon5 = findViewById(R.id.ibPokemon5)
        ibPokemon6 = findViewById(R.id.ibPokemon6)
        ibPokemon7 = findViewById(R.id.ibPokemon7)
        ibPokemon8 = findViewById(R.id.ibPokemon8)
        ibPokemon9 = findViewById(R.id.ibPokemon9)
        ibPokemon10 = findViewById(R.id.ibPokemon10)
        ibPokemon11 = findViewById(R.id.ibPokemon11)
        ibPokemon12 = findViewById(R.id.ibPokemon12)
        ibPokemon13 = findViewById(R.id.ibPokemon13)
        ibPokemon14 = findViewById(R.id.ibPokemon14)
        ibPokemon15 = findViewById(R.id.ibPokemon15)
        ibPokemon16 = findViewById(R.id.ibPokemon16)
        ibPokemon17 = findViewById(R.id.ibPokemon17)
        ibPokemon18 = findViewById(R.id.ibPokemon18)
        ibPokemon19 = findViewById(R.id.ibPokemon19)
        ibPokemon20 = findViewById(R.id.ibPokemon20)
        ibPokemon21 = findViewById(R.id.ibPokemon21)
        ibPokemon22 = findViewById(R.id.ibPokemon22)
        ibPokemon23 = findViewById(R.id.ibPokemon23)
        ibPokemon24 = findViewById(R.id.ibPokemon24)
        ibPokemon25 = findViewById(R.id.ibPokemon25)
        ibPokemon26 = findViewById(R.id.ibPokemon26)
        ibPokemon27 = findViewById(R.id.ibPokemon27)
        ibPokemon28 = findViewById(R.id.ibPokemon28)
        ibPokemon29 = findViewById(R.id.ibPokemon29)
        ibPokemon30 = findViewById(R.id.ibPokemon30)
        ibPokemon31 = findViewById(R.id.ibPokemon31)
        ibPokemon32 = findViewById(R.id.ibPokemon32)
        ibPokemon33 = findViewById(R.id.ibPokemon33)
        ibPokemon34 = findViewById(R.id.ibPokemon34)
        ibPokemon35 = findViewById(R.id.ibPokemon35)
        ibPokemon36 = findViewById(R.id.ibPokemon36)
        ibPokemon37 = findViewById(R.id.ibPokemon37)
        ibPokemon38 = findViewById(R.id.ibPokemon38)
        ibPokemon39 = findViewById(R.id.ibPokemon39)
        ibPokemon40 = findViewById(R.id.ibPokemon40)
        ibPokemon41 = findViewById(R.id.ibPokemon41)
        ibPokemon42 = findViewById(R.id.ibPokemon42)
        ibPokemon43 = findViewById(R.id.ibPokemon43)
        ibPokemon44 = findViewById(R.id.ibPokemon44)
        ibPokemon45 = findViewById(R.id.ibPokemon45)
        ibPokemon46 = findViewById(R.id.ibPokemon46)
        ibPokemon47 = findViewById(R.id.ibPokemon47)
        ibPokemon48 = findViewById(R.id.ibPokemon48)
        ibPokemon49 = findViewById(R.id.ibPokemon49)
        ibPokemon50 = findViewById(R.id.ibPokemon50)
        ibPokemon51 = findViewById(R.id.ibPokemon51)
        ibPokemon52 = findViewById(R.id.ibPokemon52)
        ibPokemon53 = findViewById(R.id.ibPokemon53)
        ibPokemon54 = findViewById(R.id.ibPokemon54)
        ibPokemon55 = findViewById(R.id.ibPokemon55)
        ibPokemon56 = findViewById(R.id.ibPokemon56)
        ibPokemon57 = findViewById(R.id.ibPokemon57)
        ibPokemon58 = findViewById(R.id.ibPokemon58)
        ibPokemon59 = findViewById(R.id.ibPokemon59)
        ibPokemon60 = findViewById(R.id.ibPokemon60)
        ibPokemon61 = findViewById(R.id.ibPokemon61)
        ibPokemon62 = findViewById(R.id.ibPokemon62)
        ibPokemon63 = findViewById(R.id.ibPokemon63)
        ibPokemon64 = findViewById(R.id.ibPokemon64)
        ibPokemon65 = findViewById(R.id.ibPokemon65)
        ibPokemon66 = findViewById(R.id.ibPokemon66)
        ibPokemon67 = findViewById(R.id.ibPokemon67)
        ibPokemon68 = findViewById(R.id.ibPokemon68)
        ibPokemon69 = findViewById(R.id.ibPokemon69)
        ibPokemon70 = findViewById(R.id.ibPokemon70)
        ibPokemon71 = findViewById(R.id.ibPokemon71)
        ibPokemon72 = findViewById(R.id.ibPokemon72)
        ibPokemon73 = findViewById(R.id.ibPokemon73)
        ibPokemon74 = findViewById(R.id.ibPokemon74)
        ibPokemon75 = findViewById(R.id.ibPokemon75)
        ibPokemon76 = findViewById(R.id.ibPokemon76)
        ibPokemon77 = findViewById(R.id.ibPokemon77)
        ibPokemon78 = findViewById(R.id.ibPokemon78)
        ibPokemon79 = findViewById(R.id.ibPokemon79)
        ibPokemon80 = findViewById(R.id.ibPokemon80)
        ibPokemon81 = findViewById(R.id.ibPokemon81)
        ibPokemon82 = findViewById(R.id.ibPokemon82)
        ibPokemon83 = findViewById(R.id.ibPokemon83)
        ibPokemon84 = findViewById(R.id.ibPokemon84)
        ibPokemon85 = findViewById(R.id.ibPokemon85)
        ibPokemon86 = findViewById(R.id.ibPokemon86)
        ibPokemon87 = findViewById(R.id.ibPokemon87)
        ibPokemon88 = findViewById(R.id.ibPokemon88)
        ibPokemon89 = findViewById(R.id.ibPokemon89)
        ibPokemon90 = findViewById(R.id.ibPokemon90)
        ibPokemon91 = findViewById(R.id.ibPokemon91)
        ibPokemon92 = findViewById(R.id.ibPokemon92)
        ibPokemon93 = findViewById(R.id.ibPokemon93)
        ibPokemon94 = findViewById(R.id.ibPokemon94)
        ibPokemon95 = findViewById(R.id.ibPokemon95)
        ibPokemon96 = findViewById(R.id.ibPokemon96)
        ibPokemon97 = findViewById(R.id.ibPokemon97)
        ibPokemon98 = findViewById(R.id.ibPokemon98)
        ibPokemon99 = findViewById(R.id.ibPokemon99)
        ibPokemon100 = findViewById(R.id.ibPokemon100)
        ibPokemon101 = findViewById(R.id.ibPokemon101)
        ibPokemon102 = findViewById(R.id.ibPokemon102)
        ibPokemon103 = findViewById(R.id.ibPokemon103)
        ibPokemon104 = findViewById(R.id.ibPokemon104)
        ibPokemon105 = findViewById(R.id.ibPokemon105)
        ibPokemon106 = findViewById(R.id.ibPokemon106)
        ibPokemon107 = findViewById(R.id.ibPokemon107)
        ibPokemon108 = findViewById(R.id.ibPokemon108)
        ibPokemon109 = findViewById(R.id.ibPokemon109)
        ibPokemon110 = findViewById(R.id.ibPokemon110)
        ibPokemon111 = findViewById(R.id.ibPokemon111)
        ibPokemon112 = findViewById(R.id.ibPokemon112)
        ibPokemon113 = findViewById(R.id.ibPokemon113)
        ibPokemon114 = findViewById(R.id.ibPokemon114)
        ibPokemon115 = findViewById(R.id.ibPokemon115)
        ibPokemon116 = findViewById(R.id.ibPokemon116)
        ibPokemon117 = findViewById(R.id.ibPokemon117)
        ibPokemon118 = findViewById(R.id.ibPokemon118)
        ibPokemon119 = findViewById(R.id.ibPokemon119)
        ibPokemon120 = findViewById(R.id.ibPokemon120)
        ibPokemon121 = findViewById(R.id.ibPokemon121)
        ibPokemon122 = findViewById(R.id.ibPokemon122)
        ibPokemon123 = findViewById(R.id.ibPokemon123)
        ibPokemon124 = findViewById(R.id.ibPokemon124)
        ibPokemon125 = findViewById(R.id.ibPokemon125)
        ibPokemon126 = findViewById(R.id.ibPokemon126)
        ibPokemon127 = findViewById(R.id.ibPokemon127)
        ibPokemon128 = findViewById(R.id.ibPokemon128)
        ibPokemon129 = findViewById(R.id.ibPokemon129)
        ibPokemon130 = findViewById(R.id.ibPokemon130)
        ibPokemon131 = findViewById(R.id.ibPokemon131)
        ibPokemon132 = findViewById(R.id.ibPokemon132)
        ibPokemon133 = findViewById(R.id.ibPokemon133)
        ibPokemon134 = findViewById(R.id.ibPokemon134)
        ibPokemon135 = findViewById(R.id.ibPokemon135)
        ibPokemon136 = findViewById(R.id.ibPokemon136)
        ibPokemon137 = findViewById(R.id.ibPokemon137)
        ibPokemon138 = findViewById(R.id.ibPokemon138)
        ibPokemon139 = findViewById(R.id.ibPokemon139)
        ibPokemon140 = findViewById(R.id.ibPokemon140)
        ibPokemon141 = findViewById(R.id.ibPokemon141)
        ibPokemon142 = findViewById(R.id.ibPokemon142)
        ibPokemon143 = findViewById(R.id.ibPokemon143)
        ibPokemon144 = findViewById(R.id.ibPokemon144)
        ibPokemon145 = findViewById(R.id.ibPokemon145)
        ibPokemon146 = findViewById(R.id.ibPokemon146)
        ibPokemon147 = findViewById(R.id.ibPokemon147)
        ibPokemon148 = findViewById(R.id.ibPokemon148)
        ibPokemon149 = findViewById(R.id.ibPokemon149)
        ibPokemon150 = findViewById(R.id.ibPokemon150)
        ibPokemon151 = findViewById(R.id.ibPokemon151)


        tvPokemon1 = findViewById(R.id.tvPokemon1)
        tvPokemon2 = findViewById(R.id.tvPokemon2)
        tvPokemon3 = findViewById(R.id.tvPokemon3)
        tvPokemon4 = findViewById(R.id.tvPokemon4)
        tvPokemon5 = findViewById(R.id.tvPokemon5)
        tvPokemon6 = findViewById(R.id.tvPokemon6)
        tvPokemon7 = findViewById(R.id.tvPokemon7)
        tvPokemon8 = findViewById(R.id.tvPokemon8)
        tvPokemon9 = findViewById(R.id.tvPokemon9)
        tvPokemon10 = findViewById(R.id.tvPokemon10)
        tvPokemon11 = findViewById(R.id.tvPokemon11)
        tvPokemon12 = findViewById(R.id.tvPokemon12)
        tvPokemon13 = findViewById(R.id.tvPokemon13)
        tvPokemon14 = findViewById(R.id.tvPokemon14)
        tvPokemon15 = findViewById(R.id.tvPokemon15)
        tvPokemon16 = findViewById(R.id.tvPokemon16)
        tvPokemon17 = findViewById(R.id.tvPokemon17)
        tvPokemon18 = findViewById(R.id.tvPokemon18)
        tvPokemon19 = findViewById(R.id.tvPokemon19)
        tvPokemon20 = findViewById(R.id.tvPokemon20)
        tvPokemon21 = findViewById(R.id.tvPokemon21)
        tvPokemon22 = findViewById(R.id.tvPokemon22)
        tvPokemon23 = findViewById(R.id.tvPokemon23)
        tvPokemon24 = findViewById(R.id.tvPokemon24)
        tvPokemon25 = findViewById(R.id.tvPokemon25)
        tvPokemon26 = findViewById(R.id.tvPokemon26)
        tvPokemon27 = findViewById(R.id.tvPokemon27)
        tvPokemon28 = findViewById(R.id.tvPokemon28)
        tvPokemon29 = findViewById(R.id.tvPokemon29)
        tvPokemon30 = findViewById(R.id.tvPokemon30)
        tvPokemon31 = findViewById(R.id.tvPokemon31)
        tvPokemon32 = findViewById(R.id.tvPokemon32)
        tvPokemon33 = findViewById(R.id.tvPokemon33)
        tvPokemon34 = findViewById(R.id.tvPokemon34)
        tvPokemon35 = findViewById(R.id.tvPokemon35)
        tvPokemon36 = findViewById(R.id.tvPokemon36)
        tvPokemon37 = findViewById(R.id.tvPokemon37)
        tvPokemon38 = findViewById(R.id.tvPokemon38)
        tvPokemon39 = findViewById(R.id.tvPokemon39)
        tvPokemon40 = findViewById(R.id.tvPokemon40)
        tvPokemon41 = findViewById(R.id.tvPokemon41)
        tvPokemon42 = findViewById(R.id.tvPokemon42)
        tvPokemon43 = findViewById(R.id.tvPokemon43)
        tvPokemon44 = findViewById(R.id.tvPokemon44)
        tvPokemon45 = findViewById(R.id.tvPokemon45)
        tvPokemon46 = findViewById(R.id.tvPokemon46)
        tvPokemon47 = findViewById(R.id.tvPokemon47)
        tvPokemon48 = findViewById(R.id.tvPokemon48)
        tvPokemon49 = findViewById(R.id.tvPokemon49)
        tvPokemon50 = findViewById(R.id.tvPokemon50)
        tvPokemon51 = findViewById(R.id.tvPokemon51)
        tvPokemon52 = findViewById(R.id.tvPokemon52)
        tvPokemon53 = findViewById(R.id.tvPokemon53)
        tvPokemon54 = findViewById(R.id.tvPokemon54)
        tvPokemon55 = findViewById(R.id.tvPokemon55)
        tvPokemon56 = findViewById(R.id.tvPokemon56)
        tvPokemon57 = findViewById(R.id.tvPokemon57)
        tvPokemon58 = findViewById(R.id.tvPokemon58)
        tvPokemon59 = findViewById(R.id.tvPokemon59)
        tvPokemon60 = findViewById(R.id.tvPokemon60)
        tvPokemon61 = findViewById(R.id.tvPokemon61)
        tvPokemon62 = findViewById(R.id.tvPokemon62)
        tvPokemon63 = findViewById(R.id.tvPokemon63)
        tvPokemon64 = findViewById(R.id.tvPokemon64)
        tvPokemon65 = findViewById(R.id.tvPokemon65)
        tvPokemon66 = findViewById(R.id.tvPokemon66)
        tvPokemon67 = findViewById(R.id.tvPokemon67)
        tvPokemon68 = findViewById(R.id.tvPokemon68)
        tvPokemon69 = findViewById(R.id.tvPokemon69)
        tvPokemon70 = findViewById(R.id.tvPokemon70)
        tvPokemon71 = findViewById(R.id.tvPokemon71)
        tvPokemon72 = findViewById(R.id.tvPokemon72)
        tvPokemon73 = findViewById(R.id.tvPokemon73)
        tvPokemon74 = findViewById(R.id.tvPokemon74)
        tvPokemon75 = findViewById(R.id.tvPokemon75)
        tvPokemon76 = findViewById(R.id.tvPokemon76)
        tvPokemon77 = findViewById(R.id.tvPokemon77)
        tvPokemon78 = findViewById(R.id.tvPokemon78)
        tvPokemon79 = findViewById(R.id.tvPokemon79)
        tvPokemon80 = findViewById(R.id.tvPokemon80)
        tvPokemon81 = findViewById(R.id.tvPokemon81)
        tvPokemon82 = findViewById(R.id.tvPokemon82)
        tvPokemon83 = findViewById(R.id.tvPokemon83)
        tvPokemon84 = findViewById(R.id.tvPokemon84)
        tvPokemon85 = findViewById(R.id.tvPokemon85)
        tvPokemon86 = findViewById(R.id.tvPokemon86)
        tvPokemon87 = findViewById(R.id.tvPokemon87)
        tvPokemon88 = findViewById(R.id.tvPokemon88)
        tvPokemon89 = findViewById(R.id.tvPokemon89)
        tvPokemon90 = findViewById(R.id.tvPokemon90)
        tvPokemon91 = findViewById(R.id.tvPokemon91)
        tvPokemon92 = findViewById(R.id.tvPokemon92)
        tvPokemon93 = findViewById(R.id.tvPokemon93)
        tvPokemon94 = findViewById(R.id.tvPokemon94)
        tvPokemon95 = findViewById(R.id.tvPokemon95)
        tvPokemon96 = findViewById(R.id.tvPokemon96)
        tvPokemon97 = findViewById(R.id.tvPokemon97)
        tvPokemon98 = findViewById(R.id.tvPokemon98)
        tvPokemon99 = findViewById(R.id.tvPokemon99)
        tvPokemon100 = findViewById(R.id.tvPokemon100)
        tvPokemon101 = findViewById(R.id.tvPokemon101)
        tvPokemon102 = findViewById(R.id.tvPokemon102)
        tvPokemon103 = findViewById(R.id.tvPokemon103)
        tvPokemon104 = findViewById(R.id.tvPokemon104)
        tvPokemon105 = findViewById(R.id.tvPokemon105)
        tvPokemon106 = findViewById(R.id.tvPokemon106)
        tvPokemon107 = findViewById(R.id.tvPokemon107)
        tvPokemon108 = findViewById(R.id.tvPokemon108)
        tvPokemon109 = findViewById(R.id.tvPokemon109)
        tvPokemon110 = findViewById(R.id.tvPokemon110)
        tvPokemon111 = findViewById(R.id.tvPokemon111)
        tvPokemon112 = findViewById(R.id.tvPokemon112)
        tvPokemon113 = findViewById(R.id.tvPokemon113)
        tvPokemon114 = findViewById(R.id.tvPokemon114)
        tvPokemon115 = findViewById(R.id.tvPokemon115)
        tvPokemon116 = findViewById(R.id.tvPokemon116)
        tvPokemon117 = findViewById(R.id.tvPokemon117)
        tvPokemon118 = findViewById(R.id.tvPokemon118)
        tvPokemon119 = findViewById(R.id.tvPokemon119)
        tvPokemon120 = findViewById(R.id.tvPokemon120)
        tvPokemon121 = findViewById(R.id.tvPokemon121)
        tvPokemon122 = findViewById(R.id.tvPokemon122)
        tvPokemon123 = findViewById(R.id.tvPokemon123)
        tvPokemon124 = findViewById(R.id.tvPokemon124)
        tvPokemon125 = findViewById(R.id.tvPokemon125)
        tvPokemon126 = findViewById(R.id.tvPokemon126)
        tvPokemon127 = findViewById(R.id.tvPokemon127)
        tvPokemon128 = findViewById(R.id.tvPokemon128)
        tvPokemon129 = findViewById(R.id.tvPokemon129)
        tvPokemon130 = findViewById(R.id.tvPokemon130)
        tvPokemon131 = findViewById(R.id.tvPokemon131)
        tvPokemon132 = findViewById(R.id.tvPokemon132)
        tvPokemon133 = findViewById(R.id.tvPokemon133)
        tvPokemon134 = findViewById(R.id.tvPokemon134)
        tvPokemon135 = findViewById(R.id.tvPokemon135)
        tvPokemon136 = findViewById(R.id.tvPokemon136)
        tvPokemon137 = findViewById(R.id.tvPokemon137)
        tvPokemon138 = findViewById(R.id.tvPokemon138)
        tvPokemon139 = findViewById(R.id.tvPokemon139)
        tvPokemon140 = findViewById(R.id.tvPokemon140)
        tvPokemon141 = findViewById(R.id.tvPokemon141)
        tvPokemon142 = findViewById(R.id.tvPokemon142)
        tvPokemon143 = findViewById(R.id.tvPokemon143)
        tvPokemon144 = findViewById(R.id.tvPokemon144)
        tvPokemon145 = findViewById(R.id.tvPokemon145)
        tvPokemon146 = findViewById(R.id.tvPokemon146)
        tvPokemon147 = findViewById(R.id.tvPokemon147)
        tvPokemon148 = findViewById(R.id.tvPokemon148)
        tvPokemon149 = findViewById(R.id.tvPokemon149)
        tvPokemon150 = findViewById(R.id.tvPokemon150)
        tvPokemon151 = findViewById(R.id.tvPokemon151)

        ibPokemon1.setOnClickListener(this)
        ibPokemon2.setOnClickListener(this)
        ibPokemon3.setOnClickListener(this)
        ibPokemon4.setOnClickListener(this)
        ibPokemon5.setOnClickListener(this)
        ibPokemon6.setOnClickListener(this)
        ibPokemon7.setOnClickListener(this)
        ibPokemon8.setOnClickListener(this)
        ibPokemon9.setOnClickListener(this)
        ibPokemon10.setOnClickListener(this)
        ibPokemon11.setOnClickListener(this)
        ibPokemon12.setOnClickListener(this)
        ibPokemon13.setOnClickListener(this)
        ibPokemon14.setOnClickListener(this)
        ibPokemon15.setOnClickListener(this)
        ibPokemon16.setOnClickListener(this)
        ibPokemon17.setOnClickListener(this)
        ibPokemon18.setOnClickListener(this)
        ibPokemon19.setOnClickListener(this)
        ibPokemon20.setOnClickListener(this)
        ibPokemon21.setOnClickListener(this)
        ibPokemon22.setOnClickListener(this)
        ibPokemon23.setOnClickListener(this)
        ibPokemon24.setOnClickListener(this)
        ibPokemon25.setOnClickListener(this)
        ibPokemon26.setOnClickListener(this)
        ibPokemon27.setOnClickListener(this)
        ibPokemon28.setOnClickListener(this)
        ibPokemon29.setOnClickListener(this)
        ibPokemon30.setOnClickListener(this)
        ibPokemon31.setOnClickListener(this)
        ibPokemon32.setOnClickListener(this)
        ibPokemon33.setOnClickListener(this)
        ibPokemon34.setOnClickListener(this)
        ibPokemon35.setOnClickListener(this)
        ibPokemon36.setOnClickListener(this)
        ibPokemon37.setOnClickListener(this)
        ibPokemon38.setOnClickListener(this)
        ibPokemon39.setOnClickListener(this)
        ibPokemon40.setOnClickListener(this)
        ibPokemon41.setOnClickListener(this)
        ibPokemon42.setOnClickListener(this)
        ibPokemon43.setOnClickListener(this)
        ibPokemon44.setOnClickListener(this)
        ibPokemon45.setOnClickListener(this)
        ibPokemon46.setOnClickListener(this)
        ibPokemon47.setOnClickListener(this)
        ibPokemon48.setOnClickListener(this)
        ibPokemon49.setOnClickListener(this)
        ibPokemon50.setOnClickListener(this)
        ibPokemon51.setOnClickListener(this)
        ibPokemon52.setOnClickListener(this)
        ibPokemon53.setOnClickListener(this)
        ibPokemon54.setOnClickListener(this)
        ibPokemon55.setOnClickListener(this)
        ibPokemon56.setOnClickListener(this)
        ibPokemon57.setOnClickListener(this)
        ibPokemon58.setOnClickListener(this)
        ibPokemon59.setOnClickListener(this)
        ibPokemon60.setOnClickListener(this)
        ibPokemon61.setOnClickListener(this)
        ibPokemon62.setOnClickListener(this)
        ibPokemon63.setOnClickListener(this)
        ibPokemon64.setOnClickListener(this)
        ibPokemon65.setOnClickListener(this)
        ibPokemon66.setOnClickListener(this)
        ibPokemon67.setOnClickListener(this)
        ibPokemon68.setOnClickListener(this)
        ibPokemon69.setOnClickListener(this)
        ibPokemon70.setOnClickListener(this)
        ibPokemon71.setOnClickListener(this)
        ibPokemon72.setOnClickListener(this)
        ibPokemon73.setOnClickListener(this)
        ibPokemon74.setOnClickListener(this)
        ibPokemon75.setOnClickListener(this)
        ibPokemon76.setOnClickListener(this)
        ibPokemon77.setOnClickListener(this)
        ibPokemon78.setOnClickListener(this)
        ibPokemon79.setOnClickListener(this)
        ibPokemon80.setOnClickListener(this)
        ibPokemon81.setOnClickListener(this)
        ibPokemon82.setOnClickListener(this)
        ibPokemon83.setOnClickListener(this)
        ibPokemon84.setOnClickListener(this)
        ibPokemon85.setOnClickListener(this)
        ibPokemon86.setOnClickListener(this)
        ibPokemon87.setOnClickListener(this)
        ibPokemon88.setOnClickListener(this)
        ibPokemon89.setOnClickListener(this)
        ibPokemon90.setOnClickListener(this)
        ibPokemon91.setOnClickListener(this)
        ibPokemon92.setOnClickListener(this)
        ibPokemon93.setOnClickListener(this)
        ibPokemon94.setOnClickListener(this)
        ibPokemon95.setOnClickListener(this)
        ibPokemon96.setOnClickListener(this)
        ibPokemon97.setOnClickListener(this)
        ibPokemon98.setOnClickListener(this)
        ibPokemon99.setOnClickListener(this)
        ibPokemon100.setOnClickListener(this)
        ibPokemon101.setOnClickListener(this)
        ibPokemon102.setOnClickListener(this)
        ibPokemon103.setOnClickListener(this)
        ibPokemon104.setOnClickListener(this)
        ibPokemon105.setOnClickListener(this)
        ibPokemon106.setOnClickListener(this)
        ibPokemon107.setOnClickListener(this)
        ibPokemon108.setOnClickListener(this)
        ibPokemon109.setOnClickListener(this)
        ibPokemon110.setOnClickListener(this)
        ibPokemon111.setOnClickListener(this)
        ibPokemon112.setOnClickListener(this)
        ibPokemon113.setOnClickListener(this)
        ibPokemon114.setOnClickListener(this)
        ibPokemon115.setOnClickListener(this)
        ibPokemon116.setOnClickListener(this)
        ibPokemon117.setOnClickListener(this)
        ibPokemon118.setOnClickListener(this)
        ibPokemon119.setOnClickListener(this)
        ibPokemon120.setOnClickListener(this)
        ibPokemon121.setOnClickListener(this)
        ibPokemon122.setOnClickListener(this)
        ibPokemon123.setOnClickListener(this)
        ibPokemon124.setOnClickListener(this)
        ibPokemon125.setOnClickListener(this)
        ibPokemon126.setOnClickListener(this)
        ibPokemon127.setOnClickListener(this)
        ibPokemon128.setOnClickListener(this)
        ibPokemon129.setOnClickListener(this)
        ibPokemon130.setOnClickListener(this)
        ibPokemon131.setOnClickListener(this)
        ibPokemon132.setOnClickListener(this)
        ibPokemon133.setOnClickListener(this)
        ibPokemon134.setOnClickListener(this)
        ibPokemon135.setOnClickListener(this)
        ibPokemon136.setOnClickListener(this)
        ibPokemon137.setOnClickListener(this)
        ibPokemon138.setOnClickListener(this)
        ibPokemon139.setOnClickListener(this)
        ibPokemon140.setOnClickListener(this)
        ibPokemon141.setOnClickListener(this)
        ibPokemon142.setOnClickListener(this)
        ibPokemon143.setOnClickListener(this)
        ibPokemon144.setOnClickListener(this)
        ibPokemon145.setOnClickListener(this)
        ibPokemon146.setOnClickListener(this)
        ibPokemon147.setOnClickListener(this)
        ibPokemon148.setOnClickListener(this)
        ibPokemon149.setOnClickListener(this)
        ibPokemon150.setOnClickListener(this)
        ibPokemon151.setOnClickListener(this)



        flechita = findViewById(R.id.ibflechita)
        tvNumeroPokemon = findViewById(R.id.tvNumeroPokemon)

        flechita.setOnClickListener {
            finish()
        }
        pokemons = Constants.getPokemons()

        listPokemon = prefs.getPokemonsList()
        tvNumeroPokemon.text = "${listPokemon.size - 1}/${pokemons!!.size}"

        for (pokemon in pokemons!!) {
            when (pokemon.id) {
                1 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon1.setImageResource(pokemon.imagenColor)
                        tvPokemon1.text = pokemon.nombre
                    } else {
                        ibPokemon1.setImageResource(pokemon.imagenBlack)
                        tvPokemon1.text = "???"
                    }
                }

                2 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon2.setImageResource(pokemon.imagenColor)
                        tvPokemon2.text = pokemon.nombre
                    } else {
                        ibPokemon2.setImageResource(pokemon.imagenBlack)
                        tvPokemon2.text = "???"
                    }
                }

                3 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon3.setImageResource(pokemon.imagenColor)
                        tvPokemon3.text = pokemon.nombre
                    } else {
                        ibPokemon3.setImageResource(pokemon.imagenBlack)
                        tvPokemon3.text = "???"
                    }
                }

                4 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon4.setImageResource(pokemon.imagenColor)
                        tvPokemon4.text = pokemon.nombre
                    } else {
                        ibPokemon4.setImageResource(pokemon.imagenBlack)
                        tvPokemon4.text = "???"
                    }
                }

                5 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon5.setImageResource(pokemon.imagenColor)
                        tvPokemon5.text = pokemon.nombre
                    } else {
                        ibPokemon5.setImageResource(pokemon.imagenBlack)
                        tvPokemon5.text = "???"
                    }
                }

                6 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon6.setImageResource(pokemon.imagenColor)
                        tvPokemon6.text = pokemon.nombre
                    } else {
                        ibPokemon6.setImageResource(pokemon.imagenBlack)
                        tvPokemon6.text = "???"
                    }
                }

                7 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon7.setImageResource(pokemon.imagenColor)
                        tvPokemon7.text = pokemon.nombre
                    } else {
                        ibPokemon7.setImageResource(pokemon.imagenBlack)
                        tvPokemon7.text = "???"
                    }
                }

                8 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon8.setImageResource(pokemon.imagenColor)
                        tvPokemon8.text = pokemon.nombre
                    } else {
                        ibPokemon8.setImageResource(pokemon.imagenBlack)
                        tvPokemon8.text = "???"
                    }
                }

                9 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon9.setImageResource(pokemon.imagenColor)
                        tvPokemon9.text = pokemon.nombre
                    } else {
                        ibPokemon9.setImageResource(pokemon.imagenBlack)
                        tvPokemon9.text = "???"
                    }
                }

                10 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon10.setImageResource(pokemon.imagenColor)
                        tvPokemon10.text = pokemon.nombre
                    } else {
                        ibPokemon10.setImageResource(pokemon.imagenBlack)
                        tvPokemon10.text = "???"
                    }
                }

                11 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon11.setImageResource(pokemon.imagenColor)
                        tvPokemon11.text = pokemon.nombre
                    } else {
                        ibPokemon11.setImageResource(pokemon.imagenBlack)
                        tvPokemon11.text = "???"
                    }
                }

                12 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon12.setImageResource(pokemon.imagenColor)
                        tvPokemon12.text = pokemon.nombre
                    } else {
                        ibPokemon12.setImageResource(pokemon.imagenBlack)
                        tvPokemon12.text = "???"
                    }
                }

                13 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon13.setImageResource(pokemon.imagenColor)
                        tvPokemon13.text = pokemon.nombre
                    } else {
                        ibPokemon13.setImageResource(pokemon.imagenBlack)
                        tvPokemon13.text = "???"
                    }
                }

                14 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon14.setImageResource(pokemon.imagenColor)
                        tvPokemon14.text = pokemon.nombre
                    } else {
                        ibPokemon14.setImageResource(pokemon.imagenBlack)
                        tvPokemon14.text = "???"
                    }
                }

                15 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon15.setImageResource(pokemon.imagenColor)
                        tvPokemon15.text = pokemon.nombre
                    } else {
                        ibPokemon15.setImageResource(pokemon.imagenBlack)
                        tvPokemon15.text = "???"
                    }
                }

                16 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon16.setImageResource(pokemon.imagenColor)
                        tvPokemon16.text = pokemon.nombre
                    } else {
                        ibPokemon16.setImageResource(pokemon.imagenBlack)
                        tvPokemon16.text = "???"
                    }
                }

                17 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon17.setImageResource(pokemon.imagenColor)
                        tvPokemon17.text = pokemon.nombre
                    } else {
                        ibPokemon17.setImageResource(pokemon.imagenBlack)
                        tvPokemon17.text = "???"
                    }
                }

                18 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon18.setImageResource(pokemon.imagenColor)
                        tvPokemon18.text = pokemon.nombre
                    } else {
                        ibPokemon18.setImageResource(pokemon.imagenBlack)
                        tvPokemon18.text = "???"
                    }
                }

                19 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon19.setImageResource(pokemon.imagenColor)
                        tvPokemon19.text = pokemon.nombre
                    } else {
                        ibPokemon19.setImageResource(pokemon.imagenBlack)
                        tvPokemon19.text = "???"
                    }
                }

                20 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon20.setImageResource(pokemon.imagenColor)
                        tvPokemon20.text = pokemon.nombre
                    } else {
                        ibPokemon20.setImageResource(pokemon.imagenBlack)
                        tvPokemon20.text = "???"
                    }
                }

                21 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon21.setImageResource(pokemon.imagenColor)
                        tvPokemon21.text = pokemon.nombre
                    } else {
                        ibPokemon21.setImageResource(pokemon.imagenBlack)
                        tvPokemon21.text = "???"
                    }
                }

                22 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon22.setImageResource(pokemon.imagenColor)
                        tvPokemon22.text = pokemon.nombre
                    } else {
                        ibPokemon22.setImageResource(pokemon.imagenBlack)
                        tvPokemon22.text = "???"
                    }
                }

                23 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon23.setImageResource(pokemon.imagenColor)
                        tvPokemon23.text = pokemon.nombre
                    } else {
                        ibPokemon23.setImageResource(pokemon.imagenBlack)
                        tvPokemon23.text = "???"
                    }
                }

                24 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon24.setImageResource(pokemon.imagenColor)
                        tvPokemon24.text = pokemon.nombre
                    } else {
                        ibPokemon24.setImageResource(pokemon.imagenBlack)
                        tvPokemon24.text = "???"
                    }
                }

                25 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon25.setImageResource(pokemon.imagenColor)
                        tvPokemon25.text = pokemon.nombre
                    } else {
                        ibPokemon25.setImageResource(pokemon.imagenBlack)
                        tvPokemon25.text = "???"
                    }
                }

                26 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon26.setImageResource(pokemon.imagenColor)
                        tvPokemon26.text = pokemon.nombre
                    } else {
                        ibPokemon26.setImageResource(pokemon.imagenBlack)
                        tvPokemon26.text = "???"
                    }
                }

                27 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon27.setImageResource(pokemon.imagenColor)
                        tvPokemon27.text = pokemon.nombre
                    } else {
                        ibPokemon27.setImageResource(pokemon.imagenBlack)
                        tvPokemon27.text = "???"
                    }
                }

                28 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon28.setImageResource(pokemon.imagenColor)
                        tvPokemon28.text = pokemon.nombre
                    } else {
                        ibPokemon28.setImageResource(pokemon.imagenBlack)
                        tvPokemon28.text = "???"
                    }
                }

                29 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon29.setImageResource(pokemon.imagenColor)
                        tvPokemon29.text = pokemon.nombre
                    } else {
                        ibPokemon29.setImageResource(pokemon.imagenBlack)
                        tvPokemon29.text = "???"
                    }
                }

                30 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon30.setImageResource(pokemon.imagenColor)
                        tvPokemon30.text = pokemon.nombre
                    } else {
                        ibPokemon30.setImageResource(pokemon.imagenBlack)
                        tvPokemon30.text = "???"
                    }
                }

                31 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon31.setImageResource(pokemon.imagenColor)
                        tvPokemon31.text = pokemon.nombre
                    } else {
                        ibPokemon31.setImageResource(pokemon.imagenBlack)
                        tvPokemon31.text = "???"
                    }
                }

                32 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon32.setImageResource(pokemon.imagenColor)
                        tvPokemon32.text = pokemon.nombre
                    } else {
                        ibPokemon32.setImageResource(pokemon.imagenBlack)
                        tvPokemon32.text = "???"
                    }
                }

                33 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon33.setImageResource(pokemon.imagenColor)
                        tvPokemon33.text = pokemon.nombre
                    } else {
                        ibPokemon33.setImageResource(pokemon.imagenBlack)
                        tvPokemon33.text = "???"
                    }
                }

                34 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon34.setImageResource(pokemon.imagenColor)
                        tvPokemon34.text = pokemon.nombre
                    } else {
                        ibPokemon34.setImageResource(pokemon.imagenBlack)
                        tvPokemon34.text = "???"
                    }
                }

                35 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon35.setImageResource(pokemon.imagenColor)
                        tvPokemon35.text = pokemon.nombre
                    } else {
                        ibPokemon35.setImageResource(pokemon.imagenBlack)
                        tvPokemon35.text = "???"
                    }
                }

                36 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon36.setImageResource(pokemon.imagenColor)
                        tvPokemon36.text = pokemon.nombre
                    } else {
                        ibPokemon36.setImageResource(pokemon.imagenBlack)
                        tvPokemon36.text = "???"
                    }
                }

                37 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon37.setImageResource(pokemon.imagenColor)
                        tvPokemon37.text = pokemon.nombre
                    } else {
                        ibPokemon37.setImageResource(pokemon.imagenBlack)
                        tvPokemon37.text = "???"
                    }
                }

                38 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon38.setImageResource(pokemon.imagenColor)
                        tvPokemon38.text = pokemon.nombre
                    } else {
                        ibPokemon38.setImageResource(pokemon.imagenBlack)
                        tvPokemon38.text = "???"
                    }
                }

                39 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon39.setImageResource(pokemon.imagenColor)
                        tvPokemon39.text = pokemon.nombre
                    } else {
                        ibPokemon39.setImageResource(pokemon.imagenBlack)
                        tvPokemon39.text = "???"
                    }
                }

                40 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon40.setImageResource(pokemon.imagenColor)
                        tvPokemon40.text = pokemon.nombre
                    } else {
                        ibPokemon40.setImageResource(pokemon.imagenBlack)
                        tvPokemon40.text = "???"
                    }
                }

                41 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon41.setImageResource(pokemon.imagenColor)
                        tvPokemon41.text = pokemon.nombre
                    } else {
                        ibPokemon41.setImageResource(pokemon.imagenBlack)
                        tvPokemon41.text = "???"
                    }
                }

                42 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon42.setImageResource(pokemon.imagenColor)
                        tvPokemon42.text = pokemon.nombre
                    } else {
                        ibPokemon42.setImageResource(pokemon.imagenBlack)
                        tvPokemon42.text = "???"
                    }
                }

                43 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon43.setImageResource(pokemon.imagenColor)
                        tvPokemon43.text = pokemon.nombre
                    } else {
                        ibPokemon43.setImageResource(pokemon.imagenBlack)
                        tvPokemon43.text = "???"
                    }
                }

                44 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon44.setImageResource(pokemon.imagenColor)
                        tvPokemon44.text = pokemon.nombre
                    } else {
                        ibPokemon44.setImageResource(pokemon.imagenBlack)
                        tvPokemon44.text = "???"
                    }
                }

                45 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon45.setImageResource(pokemon.imagenColor)
                        tvPokemon45.text = pokemon.nombre
                    } else {
                        ibPokemon45.setImageResource(pokemon.imagenBlack)
                        tvPokemon45.text = "???"
                    }
                }

                46 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon46.setImageResource(pokemon.imagenColor)
                        tvPokemon46.text = pokemon.nombre
                    } else {
                        ibPokemon46.setImageResource(pokemon.imagenBlack)
                        tvPokemon46.text = "???"
                    }
                }

                47 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon47.setImageResource(pokemon.imagenColor)
                        tvPokemon47.text = pokemon.nombre
                    } else {
                        ibPokemon47.setImageResource(pokemon.imagenBlack)
                        tvPokemon47.text = "???"
                    }
                }

                48 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon48.setImageResource(pokemon.imagenColor)
                        tvPokemon48.text = pokemon.nombre
                    } else {
                        ibPokemon48.setImageResource(pokemon.imagenBlack)
                        tvPokemon48.text = "???"
                    }
                }

                49 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon49.setImageResource(pokemon.imagenColor)
                        tvPokemon49.text = pokemon.nombre
                    } else {
                        ibPokemon49.setImageResource(pokemon.imagenBlack)
                        tvPokemon49.text = "???"
                    }
                }

                50 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon50.setImageResource(pokemon.imagenColor)
                        tvPokemon50.text = pokemon.nombre
                    } else {
                        ibPokemon50.setImageResource(pokemon.imagenBlack)
                        tvPokemon50.text = "???"
                    }
                }

                51 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon51.setImageResource(pokemon.imagenColor)
                        tvPokemon51.text = pokemon.nombre
                    } else {
                        ibPokemon51.setImageResource(pokemon.imagenBlack)
                        tvPokemon51.text = "???"
                    }
                }

                52 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon52.setImageResource(pokemon.imagenColor)
                        tvPokemon52.text = pokemon.nombre
                    } else {
                        ibPokemon52.setImageResource(pokemon.imagenBlack)
                        tvPokemon52.text = "???"
                    }
                }

                53 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon53.setImageResource(pokemon.imagenColor)
                        tvPokemon53.text = pokemon.nombre
                    } else {
                        ibPokemon53.setImageResource(pokemon.imagenBlack)
                        tvPokemon53.text = "???"
                    }
                }

                54 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon54.setImageResource(pokemon.imagenColor)
                        tvPokemon54.text = pokemon.nombre
                    } else {
                        ibPokemon54.setImageResource(pokemon.imagenBlack)
                        tvPokemon54.text = "???"
                    }
                }

                55 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon55.setImageResource(pokemon.imagenColor)
                        tvPokemon55.text = pokemon.nombre
                    } else {
                        ibPokemon55.setImageResource(pokemon.imagenBlack)
                        tvPokemon55.text = "???"
                    }
                }

                56 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon56.setImageResource(pokemon.imagenColor)
                        tvPokemon56.text = pokemon.nombre
                    } else {
                        ibPokemon56.setImageResource(pokemon.imagenBlack)
                        tvPokemon56.text = "???"
                    }
                }

                57 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon57.setImageResource(pokemon.imagenColor)
                        tvPokemon57.text = pokemon.nombre
                    } else {
                        ibPokemon57.setImageResource(pokemon.imagenBlack)
                        tvPokemon57.text = "???"
                    }
                }

                58 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon58.setImageResource(pokemon.imagenColor)
                        tvPokemon58.text = pokemon.nombre
                    } else {
                        ibPokemon58.setImageResource(pokemon.imagenBlack)
                        tvPokemon58.text = "???"
                    }
                }

                59 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon59.setImageResource(pokemon.imagenColor)
                        tvPokemon59.text = pokemon.nombre
                    } else {
                        ibPokemon59.setImageResource(pokemon.imagenBlack)
                        tvPokemon59.text = "???"
                    }
                }

                60 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon60.setImageResource(pokemon.imagenColor)
                        tvPokemon60.text = pokemon.nombre
                    } else {
                        ibPokemon60.setImageResource(pokemon.imagenBlack)
                        tvPokemon60.text = "???"
                    }
                }

                61 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon61.setImageResource(pokemon.imagenColor)
                        tvPokemon61.text = pokemon.nombre
                    } else {
                        ibPokemon61.setImageResource(pokemon.imagenBlack)
                        tvPokemon61.text = "???"
                    }
                }

                62 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon62.setImageResource(pokemon.imagenColor)
                        tvPokemon62.text = pokemon.nombre
                    } else {
                        ibPokemon62.setImageResource(pokemon.imagenBlack)
                        tvPokemon62.text = "???"
                    }
                }

                63 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon63.setImageResource(pokemon.imagenColor)
                        tvPokemon63.text = pokemon.nombre
                    } else {
                        ibPokemon63.setImageResource(pokemon.imagenBlack)
                        tvPokemon63.text = "???"
                    }
                }

                64 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon64.setImageResource(pokemon.imagenColor)
                        tvPokemon64.text = pokemon.nombre
                    } else {
                        ibPokemon64.setImageResource(pokemon.imagenBlack)
                        tvPokemon64.text = "???"
                    }
                }

                65 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon65.setImageResource(pokemon.imagenColor)
                        tvPokemon65.text = pokemon.nombre
                    } else {
                        ibPokemon65.setImageResource(pokemon.imagenBlack)
                        tvPokemon65.text = "???"
                    }
                }

                66 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon66.setImageResource(pokemon.imagenColor)
                        tvPokemon66.text = pokemon.nombre
                    } else {
                        ibPokemon66.setImageResource(pokemon.imagenBlack)
                        tvPokemon66.text = "???"
                    }
                }

                67 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon67.setImageResource(pokemon.imagenColor)
                        tvPokemon67.text = pokemon.nombre
                    } else {
                        ibPokemon67.setImageResource(pokemon.imagenBlack)
                        tvPokemon67.text = "???"
                    }
                }

                68 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon68.setImageResource(pokemon.imagenColor)
                        tvPokemon68.text = pokemon.nombre
                    } else {
                        ibPokemon68.setImageResource(pokemon.imagenBlack)
                        tvPokemon68.text = "???"
                    }
                }

                69 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon69.setImageResource(pokemon.imagenColor)
                        tvPokemon69.text = pokemon.nombre
                    } else {
                        ibPokemon69.setImageResource(pokemon.imagenBlack)
                        tvPokemon69.text = "???"
                    }
                }

                70 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon70.setImageResource(pokemon.imagenColor)
                        tvPokemon70.text = pokemon.nombre
                    } else {
                        ibPokemon70.setImageResource(pokemon.imagenBlack)
                        tvPokemon70.text = "???"
                    }
                }

                71 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon71.setImageResource(pokemon.imagenColor)
                        tvPokemon71.text = pokemon.nombre
                    } else {
                        ibPokemon71.setImageResource(pokemon.imagenBlack)
                        tvPokemon71.text = "???"
                    }
                }

                72 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon72.setImageResource(pokemon.imagenColor)
                        tvPokemon72.text = pokemon.nombre
                    } else {
                        ibPokemon72.setImageResource(pokemon.imagenBlack)
                        tvPokemon72.text = "???"
                    }
                }

                73 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon73.setImageResource(pokemon.imagenColor)
                        tvPokemon73.text = pokemon.nombre
                    } else {
                        ibPokemon73.setImageResource(pokemon.imagenBlack)
                        tvPokemon73.text = "???"
                    }
                }

                74 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon74.setImageResource(pokemon.imagenColor)
                        tvPokemon74.text = pokemon.nombre
                    } else {
                        ibPokemon74.setImageResource(pokemon.imagenBlack)
                        tvPokemon74.text = "???"
                    }
                }

                75 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon75.setImageResource(pokemon.imagenColor)
                        tvPokemon75.text = pokemon.nombre
                    } else {
                        ibPokemon75.setImageResource(pokemon.imagenBlack)
                        tvPokemon75.text = "???"
                    }
                }

                76 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon76.setImageResource(pokemon.imagenColor)
                        tvPokemon76.text = pokemon.nombre
                    } else {
                        ibPokemon76.setImageResource(pokemon.imagenBlack)
                        tvPokemon76.text = "???"
                    }
                }

                77 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon77.setImageResource(pokemon.imagenColor)
                        tvPokemon77.text = pokemon.nombre
                    } else {
                        ibPokemon77.setImageResource(pokemon.imagenBlack)
                        tvPokemon77.text = "???"
                    }
                }

                78 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon78.setImageResource(pokemon.imagenColor)
                        tvPokemon78.text = pokemon.nombre
                    } else {
                        ibPokemon78.setImageResource(pokemon.imagenBlack)
                        tvPokemon78.text = "???"
                    }
                }

                79 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon79.setImageResource(pokemon.imagenColor)
                        tvPokemon79.text = pokemon.nombre
                    } else {
                        ibPokemon79.setImageResource(pokemon.imagenBlack)
                        tvPokemon79.text = "???"
                    }
                }

                80 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon80.setImageResource(pokemon.imagenColor)
                        tvPokemon80.text = pokemon.nombre
                    } else {
                        ibPokemon80.setImageResource(pokemon.imagenBlack)
                        tvPokemon80.text = "???"
                    }
                }

                81 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon81.setImageResource(pokemon.imagenColor)
                        tvPokemon81.text = pokemon.nombre
                    } else {
                        ibPokemon81.setImageResource(pokemon.imagenBlack)
                        tvPokemon81.text = "???"
                    }
                }

                82 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon82.setImageResource(pokemon.imagenColor)
                        tvPokemon82.text = pokemon.nombre
                    } else {
                        ibPokemon82.setImageResource(pokemon.imagenBlack)
                        tvPokemon82.text = "???"
                    }
                }

                83 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon83.setImageResource(pokemon.imagenColor)
                        tvPokemon83.text = pokemon.nombre
                    } else {
                        ibPokemon83.setImageResource(pokemon.imagenBlack)
                        tvPokemon83.text = "???"
                    }
                }

                84 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon84.setImageResource(pokemon.imagenColor)
                        tvPokemon84.text = pokemon.nombre
                    } else {
                        ibPokemon84.setImageResource(pokemon.imagenBlack)
                        tvPokemon84.text = "???"
                    }
                }

                85 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon85.setImageResource(pokemon.imagenColor)
                        tvPokemon85.text = pokemon.nombre
                    } else {
                        ibPokemon85.setImageResource(pokemon.imagenBlack)
                        tvPokemon85.text = "???"
                    }
                }

                86 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon86.setImageResource(pokemon.imagenColor)
                        tvPokemon86.text = pokemon.nombre
                    } else {
                        ibPokemon86.setImageResource(pokemon.imagenBlack)
                        tvPokemon86.text = "???"
                    }
                }

                87 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon87.setImageResource(pokemon.imagenColor)
                        tvPokemon87.text = pokemon.nombre
                    } else {
                        ibPokemon87.setImageResource(pokemon.imagenBlack)
                        tvPokemon87.text = "???"
                    }
                }

                88 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon88.setImageResource(pokemon.imagenColor)
                        tvPokemon88.text = pokemon.nombre
                    } else {
                        ibPokemon88.setImageResource(pokemon.imagenBlack)
                        tvPokemon88.text = "???"
                    }
                }

                89 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon89.setImageResource(pokemon.imagenColor)
                        tvPokemon89.text = pokemon.nombre
                    } else {
                        ibPokemon89.setImageResource(pokemon.imagenBlack)
                        tvPokemon89.text = "???"
                    }
                }

                90 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon90.setImageResource(pokemon.imagenColor)
                        tvPokemon90.text = pokemon.nombre
                    } else {
                        ibPokemon90.setImageResource(pokemon.imagenBlack)
                        tvPokemon90.text = "???"
                    }
                }

                91 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon91.setImageResource(pokemon.imagenColor)
                        tvPokemon91.text = pokemon.nombre
                    } else {
                        ibPokemon91.setImageResource(pokemon.imagenBlack)
                        tvPokemon91.text = "???"
                    }
                }

                92 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon92.setImageResource(pokemon.imagenColor)
                        tvPokemon92.text = pokemon.nombre
                    } else {
                        ibPokemon92.setImageResource(pokemon.imagenBlack)
                        tvPokemon92.text = "???"
                    }
                }

                93 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon93.setImageResource(pokemon.imagenColor)
                        tvPokemon93.text = pokemon.nombre
                    } else {
                        ibPokemon93.setImageResource(pokemon.imagenBlack)
                        tvPokemon93.text = "???"
                    }
                }

                94 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon94.setImageResource(pokemon.imagenColor)
                        tvPokemon94.text = pokemon.nombre
                    } else {
                        ibPokemon94.setImageResource(pokemon.imagenBlack)
                        tvPokemon94.text = "???"
                    }
                }

                95 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon95.setImageResource(pokemon.imagenColor)
                        tvPokemon95.text = pokemon.nombre
                    } else {
                        ibPokemon95.setImageResource(pokemon.imagenBlack)
                        tvPokemon95.text = "???"
                    }
                }

                96 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon96.setImageResource(pokemon.imagenColor)
                        tvPokemon96.text = pokemon.nombre
                    } else {
                        ibPokemon96.setImageResource(pokemon.imagenBlack)
                        tvPokemon96.text = "???"
                    }
                }

                97 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon97.setImageResource(pokemon.imagenColor)
                        tvPokemon97.text = pokemon.nombre
                    } else {
                        ibPokemon97.setImageResource(pokemon.imagenBlack)
                        tvPokemon97.text = "???"
                    }
                }

                98 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon98.setImageResource(pokemon.imagenColor)
                        tvPokemon98.text = pokemon.nombre
                    } else {
                        ibPokemon98.setImageResource(pokemon.imagenBlack)
                        tvPokemon98.text = "???"
                    }
                }

                99 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon99.setImageResource(pokemon.imagenColor)
                        tvPokemon99.text = pokemon.nombre
                    } else {
                        ibPokemon99.setImageResource(pokemon.imagenBlack)
                        tvPokemon99.text = "???"
                    }
                }

                100 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon100.setImageResource(pokemon.imagenColor)
                        tvPokemon100.text = pokemon.nombre
                    } else {
                        ibPokemon100.setImageResource(pokemon.imagenBlack)
                        tvPokemon100.text = "???"
                    }
                }

                101 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon101.setImageResource(pokemon.imagenColor)
                        tvPokemon101.text = pokemon.nombre
                    } else {
                        ibPokemon101.setImageResource(pokemon.imagenBlack)
                        tvPokemon101.text = "???"
                    }
                }

                102 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon102.setImageResource(pokemon.imagenColor)
                        tvPokemon102.text = pokemon.nombre
                    } else {
                        ibPokemon102.setImageResource(pokemon.imagenBlack)
                        tvPokemon102.text = "???"
                    }
                }

                103 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon103.setImageResource(pokemon.imagenColor)
                        tvPokemon103.text = pokemon.nombre
                    } else {
                        ibPokemon103.setImageResource(pokemon.imagenBlack)
                        tvPokemon103.text = "???"
                    }
                }

                104 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon104.setImageResource(pokemon.imagenColor)
                        tvPokemon104.text = pokemon.nombre
                    } else {
                        ibPokemon104.setImageResource(pokemon.imagenBlack)
                        tvPokemon104.text = "???"
                    }
                }

                105 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon105.setImageResource(pokemon.imagenColor)
                        tvPokemon105.text = pokemon.nombre
                    } else {
                        ibPokemon105.setImageResource(pokemon.imagenBlack)
                        tvPokemon105.text = "???"
                    }
                }

                106 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon106.setImageResource(pokemon.imagenColor)
                        tvPokemon106.text = pokemon.nombre
                    } else {
                        ibPokemon106.setImageResource(pokemon.imagenBlack)
                        tvPokemon106.text = "???"
                    }
                }

                107 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon107.setImageResource(pokemon.imagenColor)
                        tvPokemon107.text = pokemon.nombre
                    } else {
                        ibPokemon107.setImageResource(pokemon.imagenBlack)
                        tvPokemon107.text = "???"
                    }
                }

                108 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon108.setImageResource(pokemon.imagenColor)
                        tvPokemon108.text = pokemon.nombre
                    } else {
                        ibPokemon108.setImageResource(pokemon.imagenBlack)
                        tvPokemon108.text = "???"
                    }
                }

                109 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon109.setImageResource(pokemon.imagenColor)
                        tvPokemon109.text = pokemon.nombre
                    } else {
                        ibPokemon109.setImageResource(pokemon.imagenBlack)
                        tvPokemon109.text = "???"
                    }
                }

                110 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon110.setImageResource(pokemon.imagenColor)
                        tvPokemon110.text = pokemon.nombre
                    } else {
                        ibPokemon110.setImageResource(pokemon.imagenBlack)
                        tvPokemon110.text = "???"
                    }
                }

                111 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon111.setImageResource(pokemon.imagenColor)
                        tvPokemon111.text = pokemon.nombre
                    } else {
                        ibPokemon111.setImageResource(pokemon.imagenBlack)
                        tvPokemon111.text = "???"
                    }
                }

                112 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon112.setImageResource(pokemon.imagenColor)
                        tvPokemon112.text = pokemon.nombre
                    } else {
                        ibPokemon112.setImageResource(pokemon.imagenBlack)
                        tvPokemon112.text = "???"
                    }
                }

                113 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon113.setImageResource(pokemon.imagenColor)
                        tvPokemon113.text = pokemon.nombre
                    } else {
                        ibPokemon113.setImageResource(pokemon.imagenBlack)
                        tvPokemon113.text = "???"
                    }
                }

                114 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon114.setImageResource(pokemon.imagenColor)
                        tvPokemon114.text = pokemon.nombre
                    } else {
                        ibPokemon114.setImageResource(pokemon.imagenBlack)
                        tvPokemon114.text = "???"
                    }
                }

                115 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon115.setImageResource(pokemon.imagenColor)
                        tvPokemon115.text = pokemon.nombre
                    } else {
                        ibPokemon115.setImageResource(pokemon.imagenBlack)
                        tvPokemon115.text = "???"
                    }
                }

                116 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon116.setImageResource(pokemon.imagenColor)
                        tvPokemon116.text = pokemon.nombre
                    } else {
                        ibPokemon116.setImageResource(pokemon.imagenBlack)
                        tvPokemon116.text = "???"
                    }
                }

                117 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon117.setImageResource(pokemon.imagenColor)
                        tvPokemon117.text = pokemon.nombre
                    } else {
                        ibPokemon117.setImageResource(pokemon.imagenBlack)
                        tvPokemon117.text = "???"
                    }
                }

                118 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon118.setImageResource(pokemon.imagenColor)
                        tvPokemon118.text = pokemon.nombre
                    } else {
                        ibPokemon118.setImageResource(pokemon.imagenBlack)
                        tvPokemon118.text = "???"
                    }
                }

                119 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon119.setImageResource(pokemon.imagenColor)
                        tvPokemon119.text = pokemon.nombre
                    } else {
                        ibPokemon119.setImageResource(pokemon.imagenBlack)
                        tvPokemon119.text = "???"
                    }
                }

                120 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon120.setImageResource(pokemon.imagenColor)
                        tvPokemon120.text = pokemon.nombre
                    } else {
                        ibPokemon120.setImageResource(pokemon.imagenBlack)
                        tvPokemon120.text = "???"
                    }
                }

                121 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon121.setImageResource(pokemon.imagenColor)
                        tvPokemon121.text = pokemon.nombre
                    } else {
                        ibPokemon121.setImageResource(pokemon.imagenBlack)
                        tvPokemon121.text = "???"
                    }
                }

                122 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon122.setImageResource(pokemon.imagenColor)
                        tvPokemon122.text = pokemon.nombre
                    } else {
                        ibPokemon122.setImageResource(pokemon.imagenBlack)
                        tvPokemon122.text = "???"
                    }
                }

                123 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon123.setImageResource(pokemon.imagenColor)
                        tvPokemon123.text = pokemon.nombre
                    } else {
                        ibPokemon123.setImageResource(pokemon.imagenBlack)
                        tvPokemon123.text = "???"
                    }
                }

                124 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon124.setImageResource(pokemon.imagenColor)
                        tvPokemon124.text = pokemon.nombre
                    } else {
                        ibPokemon124.setImageResource(pokemon.imagenBlack)
                        tvPokemon124.text = "???"
                    }
                }

                125 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon125.setImageResource(pokemon.imagenColor)
                        tvPokemon125.text = pokemon.nombre
                    } else {
                        ibPokemon125.setImageResource(pokemon.imagenBlack)
                        tvPokemon125.text = "???"
                    }
                }

                126 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon126.setImageResource(pokemon.imagenColor)
                        tvPokemon126.text = pokemon.nombre
                    } else {
                        ibPokemon126.setImageResource(pokemon.imagenBlack)
                        tvPokemon126.text = "???"
                    }
                }

                127 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon127.setImageResource(pokemon.imagenColor)
                        tvPokemon127.text = pokemon.nombre
                    } else {
                        ibPokemon127.setImageResource(pokemon.imagenBlack)
                        tvPokemon127.text = "???"
                    }
                }

                128 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon128.setImageResource(pokemon.imagenColor)
                        tvPokemon128.text = pokemon.nombre
                    } else {
                        ibPokemon128.setImageResource(pokemon.imagenBlack)
                        tvPokemon128.text = "???"
                    }
                }

                129 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon129.setImageResource(pokemon.imagenColor)
                        tvPokemon129.text = pokemon.nombre
                    } else {
                        ibPokemon129.setImageResource(pokemon.imagenBlack)
                        tvPokemon129.text = "???"
                    }
                }

                130 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon130.setImageResource(pokemon.imagenColor)
                        tvPokemon130.text = pokemon.nombre
                    } else {
                        ibPokemon130.setImageResource(pokemon.imagenBlack)
                        tvPokemon130.text = "???"
                    }
                }

                131 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon131.setImageResource(pokemon.imagenColor)
                        tvPokemon131.text = pokemon.nombre
                    } else {
                        ibPokemon131.setImageResource(pokemon.imagenBlack)
                        tvPokemon131.text = "???"
                    }
                }

                132 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon132.setImageResource(pokemon.imagenColor)
                        tvPokemon132.text = pokemon.nombre
                    } else {
                        ibPokemon132.setImageResource(pokemon.imagenBlack)
                        tvPokemon132.text = "???"
                    }
                }

                133 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon133.setImageResource(pokemon.imagenColor)
                        tvPokemon133.text = pokemon.nombre
                    } else {
                        ibPokemon133.setImageResource(pokemon.imagenBlack)
                        tvPokemon133.text = "???"
                    }
                }

                134 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon134.setImageResource(pokemon.imagenColor)
                        tvPokemon134.text = pokemon.nombre
                    } else {
                        ibPokemon134.setImageResource(pokemon.imagenBlack)
                        tvPokemon134.text = "???"
                    }
                }

                135 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon135.setImageResource(pokemon.imagenColor)
                        tvPokemon135.text = pokemon.nombre
                    } else {
                        ibPokemon135.setImageResource(pokemon.imagenBlack)
                        tvPokemon135.text = "???"
                    }
                }

                136 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon136.setImageResource(pokemon.imagenColor)
                        tvPokemon136.text = pokemon.nombre
                    } else {
                        ibPokemon136.setImageResource(pokemon.imagenBlack)
                        tvPokemon136.text = "???"
                    }
                }

                137 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon137.setImageResource(pokemon.imagenColor)
                        tvPokemon137.text = pokemon.nombre
                    } else {
                        ibPokemon137.setImageResource(pokemon.imagenBlack)
                        tvPokemon137.text = "???"
                    }
                }

                138 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon138.setImageResource(pokemon.imagenColor)
                        tvPokemon138.text = pokemon.nombre
                    } else {
                        ibPokemon138.setImageResource(pokemon.imagenBlack)
                        tvPokemon138.text = "???"
                    }
                }

                139 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon139.setImageResource(pokemon.imagenColor)
                        tvPokemon139.text = pokemon.nombre
                    } else {
                        ibPokemon139.setImageResource(pokemon.imagenBlack)
                        tvPokemon139.text = "???"
                    }
                }

                140 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon140.setImageResource(pokemon.imagenColor)
                        tvPokemon140.text = pokemon.nombre
                    } else {
                        ibPokemon140.setImageResource(pokemon.imagenBlack)
                        tvPokemon140.text = "???"
                    }
                }

                141 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon141.setImageResource(pokemon.imagenColor)
                        tvPokemon141.text = pokemon.nombre
                    } else {
                        ibPokemon141.setImageResource(pokemon.imagenBlack)
                        tvPokemon141.text = "???"
                    }
                }

                142 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon142.setImageResource(pokemon.imagenColor)
                        tvPokemon142.text = pokemon.nombre
                    } else {
                        ibPokemon142.setImageResource(pokemon.imagenBlack)
                        tvPokemon142.text = "???"
                    }
                }

                143 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon143.setImageResource(pokemon.imagenColor)
                        tvPokemon143.text = pokemon.nombre
                    } else {
                        ibPokemon143.setImageResource(pokemon.imagenBlack)
                        tvPokemon143.text = "???"
                    }
                }

                144 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon144.setImageResource(pokemon.imagenColor)
                        tvPokemon144.text = pokemon.nombre
                    } else {
                        ibPokemon144.setImageResource(pokemon.imagenBlack)
                        tvPokemon144.text = "???"
                    }
                }

                145 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon145.setImageResource(pokemon.imagenColor)
                        tvPokemon145.text = pokemon.nombre
                    } else {
                        ibPokemon145.setImageResource(pokemon.imagenBlack)
                        tvPokemon145.text = "???"
                    }
                }

                146 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon146.setImageResource(pokemon.imagenColor)
                        tvPokemon146.text = pokemon.nombre
                    } else {
                        ibPokemon146.setImageResource(pokemon.imagenBlack)
                        tvPokemon146.text = "???"
                    }
                }

                147 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon147.setImageResource(pokemon.imagenColor)
                        tvPokemon147.text = pokemon.nombre
                    } else {
                        ibPokemon147.setImageResource(pokemon.imagenBlack)
                        tvPokemon147.text = "???"
                    }
                }

                148 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon148.setImageResource(pokemon.imagenColor)
                        tvPokemon148.text = pokemon.nombre
                    } else {
                        ibPokemon148.setImageResource(pokemon.imagenBlack)
                        tvPokemon148.text = "???"
                    }
                }

                149 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon149.setImageResource(pokemon.imagenColor)
                        tvPokemon149.text = pokemon.nombre
                    } else {
                        ibPokemon149.setImageResource(pokemon.imagenBlack)
                        tvPokemon149.text = "???"
                    }
                }

                150 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon150.setImageResource(pokemon.imagenColor)
                        tvPokemon150.text = pokemon.nombre
                    } else {
                        ibPokemon150.setImageResource(pokemon.imagenBlack)
                        tvPokemon150.text = "???"
                    }
                }

                151 -> {
                    if (listPokemon.contains(pokemon.id)) {
                        ibPokemon151.setImageResource(pokemon.imagenColor)
                        tvPokemon151.text = pokemon.nombre
                    } else {
                        ibPokemon151.setImageResource(pokemon.imagenBlack)
                        tvPokemon151.text = "???"
                    }
                }


            }
        }


        //TODO : Create and Bind the Layout UI - DONT'T MODIFY THIS CODE
        /*
        binding = PokedexBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibPokedex.setOnClickListener {
            finish()
        }

        pokemons = Constants.getPokemons()

        val listPokemon= prefs.getPokemonsList()

        for (pokemon in pokemons!!){
            when(pokemon.id){
                1 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon1.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon1.text = pokemon.nombre
                    }else{
                        binding.ibPokemon1.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon1.text = "???"
                    }
                }
                2 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon2.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon2.text = pokemon.nombre
                    }else{
                        binding.ibPokemon2.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon2.text = "???"
                    }
                }
                3 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon3.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon3.text = pokemon.nombre
                    }else{
                        binding.ibPokemon3.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon3.text = "???"
                    }
                }
                4 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon4.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon4.text = pokemon.nombre
                    }else{
                        binding.ibPokemon4.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon4.text = "???"
                    }
                }
                5 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon5.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon5.text = pokemon.nombre
                    }else{
                        binding.ibPokemon5.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon5.text = "???"
                    }
                }
                6 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon6.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon6.text = pokemon.nombre
                    }else{
                        binding.ibPokemon6.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon6.text = "???"
                    }
                }
                7 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon7.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon7.text = pokemon.nombre
                    }else{
                        binding.ibPokemon7.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon7.text = "???"
                    }
                }
                8 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon8.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon8.text = pokemon.nombre
                    }else{
                        binding.ibPokemon8.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon8.text = "???"
                    }
                }
                9 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon9.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon9.text = pokemon.nombre
                    }else{
                        binding.ibPokemon9.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon9.text = "???"
                    }
                }
                10 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon10.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon10.text = pokemon.nombre
                    }else{
                        binding.ibPokemon10.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon10.text = "???"
                    }
                }
                11 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon11.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon11.text = pokemon.nombre
                    }else{
                        binding.ibPokemon11.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon11.text = "???"
                    }
                }
                12 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon12.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon12.text = pokemon.nombre
                    }else{
                        binding.ibPokemon12.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon12.text = "???"
                    }
                }
                13 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon13.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon13.text = pokemon.nombre
                    }else{
                        binding.ibPokemon13.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon13.text = "???"
                    }
                }
                14 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon14.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon14.text = pokemon.nombre
                    }else{
                        binding.ibPokemon14.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon14.text = "???"
                    }
                }
                15 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon15.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon15.text = pokemon.nombre
                    }else{
                        binding.ibPokemon15.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon15.text = "???"
                    }
                }
                16 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon16.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon16.text = pokemon.nombre
                    }else{
                        binding.ibPokemon16.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon16.text = "???"
                    }
                }
                17 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon17.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon17.text = pokemon.nombre
                    }else{
                        binding.ibPokemon17.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon17.text = "???"
                    }
                }
                18 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon18.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon18.text = pokemon.nombre
                    }else{
                        binding.ibPokemon18.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon18.text = "???"
                    }
                }
                19 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon19.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon19.text = pokemon.nombre
                    }else{
                        binding.ibPokemon19.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon19.text = "???"
                    }
                }
                20 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon20.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon20.text = pokemon.nombre
                    }else{
                        binding.ibPokemon20.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon20.text = "???"
                    }
                }
                21 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon21.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon21.text = pokemon.nombre
                    }else{
                        binding.ibPokemon21.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon21.text = "???"
                    }
                }
                22 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon22.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon22.text = pokemon.nombre
                    }else{
                        binding.ibPokemon22.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon22.text = "???"
                    }
                }
                23 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon23.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon23.text = pokemon.nombre
                    }else{
                        binding.ibPokemon23.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon23.text = "???"
                    }
                }
                24 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon24.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon24.text = pokemon.nombre
                    }else{
                        binding.ibPokemon24.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon24.text = "???"
                    }
                }
                25 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon25.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon25.text = pokemon.nombre
                    }else{
                        binding.ibPokemon25.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon25.text = "???"
                    }
                }
                26 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon26.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon26.text = pokemon.nombre
                    }else{
                        binding.ibPokemon26.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon26.text = "???"
                    }
                }
                27 ->{
                    if(listPokemon.contains(pokemon.id)){
                        binding.ibPokemon27.setImageResource(pokemon.imagenColor)
                        binding.tvPokemon27.text = pokemon.nombre
                    }else{
                        binding.ibPokemon27.setImageResource(pokemon.imagenBlack)
                        binding.tvPokemon27.text = "???"
                    }
                }
            }

        }*/


    }

    override fun onClick(v: View?) {


        when (v?.id) {
            R.id.ibPokemon1 -> {
                var num = ibPokemon1.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon2 -> {
                var num = ibPokemon2.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon3 -> {
                var num = ibPokemon3.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon4 -> {
                var num = ibPokemon4.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon5 -> {
                var num = ibPokemon5.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon6 -> {
                var num = ibPokemon6.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon7 -> {
                var num = ibPokemon7.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon8 -> {
                var num = ibPokemon8.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon9 -> {
                var num = ibPokemon9.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon10 -> {
                var num = ibPokemon10.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon11 -> {
                var num = ibPokemon11.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon12 -> {
                var num = ibPokemon12.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon13 -> {
                var num = ibPokemon13.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon14 -> {
                var num = ibPokemon14.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon15 -> {
                var num = ibPokemon15.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon16 -> {
                var num = ibPokemon16.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon17 -> {
                var num = ibPokemon17.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon18 -> {
                var num = ibPokemon18.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon19 -> {
                var num = ibPokemon19.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon20 -> {
                var num = ibPokemon20.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon21 -> {
                var num = ibPokemon21.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon22 -> {
                var num = ibPokemon22.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon23 -> {
                var num = ibPokemon23.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon24 -> {
                var num = ibPokemon24.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon25 -> {
                var num = ibPokemon25.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon26 -> {
                var num = ibPokemon26.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon27 -> {
                var num = ibPokemon27.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon28 -> {
                var num = ibPokemon28.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon29 -> {
                var num = ibPokemon29.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon30 -> {
                var num = ibPokemon30.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon31 -> {
                var num = ibPokemon31.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon32 -> {
                var num = ibPokemon32.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon33 -> {
                var num = ibPokemon33.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon34 -> {
                var num = ibPokemon34.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon35 -> {
                var num = ibPokemon35.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon36 -> {
                var num = ibPokemon36.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon37 -> {
                var num = ibPokemon37.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon38 -> {
                var num = ibPokemon38.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon39 -> {
                var num = ibPokemon39.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon40 -> {
                var num = ibPokemon40.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon41 -> {
                var num = ibPokemon41.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon42 -> {
                var num = ibPokemon42.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon43 -> {
                var num = ibPokemon43.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon44 -> {
                var num = ibPokemon44.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon45 -> {
                var num = ibPokemon45.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon46 -> {
                var num = ibPokemon46.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon47 -> {
                var num = ibPokemon47.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon48 -> {
                var num = ibPokemon48.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon49 -> {
                var num = ibPokemon49.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon50 -> {
                var num = ibPokemon50.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon51 -> {
                var num = ibPokemon51.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon52 -> {
                var num = ibPokemon52.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon53 -> {
                var num = ibPokemon53.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon54 -> {
                var num = ibPokemon54.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon55 -> {
                var num = ibPokemon55.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon56 -> {
                var num = ibPokemon56.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon57 -> {
                var num = ibPokemon57.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon58 -> {
                var num = ibPokemon58.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon59 -> {
                var num = ibPokemon59.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon60 -> {
                var num = ibPokemon60.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon61 -> {
                var num = ibPokemon61.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon62 -> {
                var num = ibPokemon62.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon63 -> {
                var num = ibPokemon63.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon64 -> {
                var num = ibPokemon64.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon65 -> {
                var num = ibPokemon65.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon66 -> {
                var num = ibPokemon66.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon67 -> {
                var num = ibPokemon67.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon68 -> {
                var num = ibPokemon68.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon69 -> {
                var num = ibPokemon69.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon70 -> {
                var num = ibPokemon70.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon71 -> {
                var num = ibPokemon71.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon72 -> {
                var num = ibPokemon72.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon73 -> {
                var num = ibPokemon73.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon74 -> {
                var num = ibPokemon74.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon75 -> {
                var num = ibPokemon75.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon76 -> {
                var num = ibPokemon76.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon77 -> {
                var num = ibPokemon77.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon78 -> {
                var num = ibPokemon78.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon79 -> {
                var num = ibPokemon79.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon80 -> {
                var num = ibPokemon80.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon81 -> {
                var num = ibPokemon81.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon82 -> {
                var num = ibPokemon82.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon83 -> {
                var num = ibPokemon83.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon84 -> {
                var num = ibPokemon84.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon85 -> {
                var num = ibPokemon85.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon86 -> {
                var num = ibPokemon86.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon87 -> {
                var num = ibPokemon87.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon88 -> {
                var num = ibPokemon88.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon89 -> {
                var num = ibPokemon89.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon90 -> {
                var num = ibPokemon90.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon91 -> {
                var num = ibPokemon91.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon92 -> {
                var num = ibPokemon92.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon93 -> {
                var num = ibPokemon93.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon94 -> {
                var num = ibPokemon94.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon95 -> {
                var num = ibPokemon95.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon96 -> {
                var num = ibPokemon96.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon97 -> {
                var num = ibPokemon97.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon98 -> {
                var num = ibPokemon98.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon99 -> {
                var num = ibPokemon99.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon100 -> {
                var num = ibPokemon100.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon101 -> {
                var num = ibPokemon101.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon102 -> {
                var num = ibPokemon102.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon103 -> {
                var num = ibPokemon103.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon104 -> {
                var num = ibPokemon104.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon105 -> {
                var num = ibPokemon105.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon106 -> {
                var num = ibPokemon106.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon107 -> {
                var num = ibPokemon107.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon108 -> {
                var num = ibPokemon108.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon109 -> {
                var num = ibPokemon109.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon110 -> {
                var num = ibPokemon110.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon111 -> {
                var num = ibPokemon111.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon112 -> {
                var num = ibPokemon112.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon113 -> {
                var num = ibPokemon113.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon114 -> {
                var num = ibPokemon114.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon115 -> {
                var num = ibPokemon115.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon116 -> {
                var num = ibPokemon116.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon117 -> {
                var num = ibPokemon117.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon118 -> {
                var num = ibPokemon118.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon119 -> {
                var num = ibPokemon119.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon120 -> {
                var num = ibPokemon120.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon121 -> {
                var num = ibPokemon121.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon122 -> {
                var num = ibPokemon122.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon123 -> {
                var num = ibPokemon123.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon124 -> {
                var num = ibPokemon124.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon125 -> {
                var num = ibPokemon125.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon126 -> {
                var num = ibPokemon126.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon127 -> {
                var num = ibPokemon127.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon128 -> {
                var num = ibPokemon128.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon129 -> {
                var num = ibPokemon129.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon130 -> {
                var num = ibPokemon130.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon131 -> {
                var num = ibPokemon131.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon132 -> {
                var num = ibPokemon132.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon133 -> {
                var num = ibPokemon133.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon134 -> {
                var num = ibPokemon134.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon135 -> {
                var num = ibPokemon135.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon136 -> {
                var num = ibPokemon136.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon137 -> {
                var num = ibPokemon137.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon138 -> {
                var num = ibPokemon138.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon139 -> {
                var num = ibPokemon139.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon140 -> {
                var num = ibPokemon140.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon141 -> {
                var num = ibPokemon141.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon142 -> {
                var num = ibPokemon142.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon143 -> {
                var num = ibPokemon143.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon144 -> {
                var num = ibPokemon144.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon145 -> {
                var num = ibPokemon145.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon146 -> {
                var num = ibPokemon146.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon147 -> {
                var num = ibPokemon147.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon148 -> {
                var num = ibPokemon148.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon149 -> {
                var num = ibPokemon149.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon150 -> {
                var num = ibPokemon150.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }

            R.id.ibPokemon151 -> {
                var num = ibPokemon151.tag.toString().toInt()
                if (listPokemon.contains(num)) {
                    mostrarPokemon(num)
                }
            }


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
        val vDebilidad1 = PokemonDialog.findViewById<View>(R.id.vDebilidad1)
        val vDebilidad2 = PokemonDialog.findViewById<View>(R.id.vDebilidad2)
        val vDebilidad3 = PokemonDialog.findViewById<View>(R.id.vDebilidad3)
        val vDebilidad4 = PokemonDialog.findViewById<View>(R.id.vDebilidad4)
        val vDebilidad5 = PokemonDialog.findViewById<View>(R.id.vDebilidad5)
        val vDebilidad6 = PokemonDialog.findViewById<View>(R.id.vDebilidad6)
        val vDebilidad7 = PokemonDialog.findViewById<View>(R.id.vDebilidad7)
        val tvDebilidad1 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad1)
        val tvDebilidad2 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad2)
        val tvDebilidad3 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad3)
        val tvDebilidad4 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad4)
        val tvDebilidad5 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad5)
        val tvDebilidad6 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad6)
        val tvDebilidad7 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad7)

        tvnombre.text = pokemon.nombre
        ivFoto.setImageResource(pokemon.imagenColor)
        tvType1.text = pokemon.tipo1
        vtipo1.background = ResourcesCompat.getDrawable(resources, pokemon.imagenTipo1, null)
        if(pokemon.tipo2 == "Ninguno"){
            tvType2.visibility = View.GONE
            vtipo2.visibility = View.GONE
        }
        tvType2.text = pokemon.tipo2
        vtipo2.background = ResourcesCompat.getDrawable(resources, pokemon.imagenTipo2, null)
        tvId.text = pokemon.id.toString()
        tvCategory.text = pokemon.categoria
        tvAltura.text = pokemon.altura
        tvPeso.text = pokemon.peso
        tvDescripcion.text = pokemon.descripcion
        vDebilidad1.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad1, null)
        tvDebilidad1.text = pokemon.debilidad1
        if(pokemon.debilidad2 == "None"){
            vDebilidad2.visibility = View.GONE
            tvDebilidad2.visibility = View.GONE
            vDebilidad3.visibility = View.GONE
            tvDebilidad3.visibility = View.GONE
            vDebilidad4.visibility = View.GONE
            tvDebilidad4.visibility = View.GONE
            vDebilidad5.visibility = View.GONE
            tvDebilidad5.visibility = View.GONE
            vDebilidad6.visibility = View.GONE
            tvDebilidad6.visibility = View.GONE
            vDebilidad7.visibility = View.GONE
            tvDebilidad7.visibility = View.GONE
            tvDebilidad2.text = pokemon.debilidad2
        }else if ( pokemon.debilidad3 == "None") {
            vDebilidad3.visibility = View.GONE
            tvDebilidad3.visibility = View.GONE
            vDebilidad4.visibility = View.GONE
            tvDebilidad4.visibility = View.GONE
            vDebilidad5.visibility = View.GONE
            tvDebilidad5.visibility = View.GONE
            vDebilidad6.visibility = View.GONE
            tvDebilidad6.visibility = View.GONE
            vDebilidad7.visibility = View.GONE
            tvDebilidad7.visibility = View.GONE
            tvDebilidad2.text = pokemon.debilidad2
            vDebilidad2.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad2, null)
        }else if ( pokemon.debilidad4 == "None") {
            vDebilidad4.visibility = View.GONE
            tvDebilidad4.visibility = View.GONE
            vDebilidad5.visibility = View.GONE
            tvDebilidad5.visibility = View.GONE
            vDebilidad6.visibility = View.GONE
            tvDebilidad6.visibility = View.GONE
            vDebilidad7.visibility = View.GONE
            tvDebilidad7.visibility = View.GONE
            tvDebilidad2.text = pokemon.debilidad2
            vDebilidad2.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad2, null)
            tvDebilidad3.text = pokemon.debilidad3
            vDebilidad3.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad3, null)
        } else if ( pokemon.debilidad5 == "None") {
            vDebilidad5.visibility = View.GONE
            tvDebilidad5.visibility = View.GONE
            vDebilidad6.visibility = View.GONE
            tvDebilidad6.visibility = View.GONE
            vDebilidad7.visibility = View.GONE
            tvDebilidad7.visibility = View.GONE
            tvDebilidad2.text = pokemon.debilidad2
            vDebilidad2.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad2, null)
            tvDebilidad3.text = pokemon.debilidad3
            vDebilidad3.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad3, null)
            tvDebilidad4.text = pokemon.debilidad4
            vDebilidad4.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad4, null)
        } else if ( pokemon.debilidad6 == "None") {
            vDebilidad6.visibility = View.GONE
            tvDebilidad6.visibility = View.GONE
            vDebilidad7.visibility = View.GONE
            tvDebilidad7.visibility = View.GONE
            tvDebilidad2.text = pokemon.debilidad2
            vDebilidad2.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad2, null)
            tvDebilidad3.text = pokemon.debilidad3
            vDebilidad3.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad3, null)
            tvDebilidad4.text = pokemon.debilidad4
            vDebilidad4.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad4, null)
            tvDebilidad5.text = pokemon.debilidad5
            vDebilidad5.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad5, null)
        } else if ( pokemon.debilidad7 == "None") {
            vDebilidad7.visibility = View.GONE
            tvDebilidad7.visibility = View.GONE
            tvDebilidad2.text = pokemon.debilidad2
            vDebilidad2.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad2, null)
            tvDebilidad3.text = pokemon.debilidad3
            vDebilidad3.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad3, null)
            tvDebilidad4.text = pokemon.debilidad4
            vDebilidad4.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad4, null)
            tvDebilidad5.text = pokemon.debilidad5
            vDebilidad5.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad5, null)
            tvDebilidad6.text = pokemon.debilidad6
            vDebilidad6.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad6, null)
        }else{
            tvDebilidad2.text = pokemon.debilidad2
            vDebilidad2.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad2, null)
            tvDebilidad3.text = pokemon.debilidad3
            vDebilidad3.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad3, null)
            tvDebilidad4.text = pokemon.debilidad4
            vDebilidad4.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad4, null)
            tvDebilidad5.text = pokemon.debilidad5
            vDebilidad5.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad5, null)
            tvDebilidad6.text = pokemon.debilidad6
            vDebilidad6.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad6, null)
            tvDebilidad7.text = pokemon.debilidad7
            vDebilidad7.background = ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad7, null)
        }
    }
}