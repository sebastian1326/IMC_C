package com.lopezing.imc_c.ui.Main

import android.app.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.lopezing.imc_c.R

import com.lopezing.imc_c.databinding.ActivityMainBinding
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    fun act(){
        val peso = mainBinding.textIp.text.toString()
        val altura = mainBinding.textIa.text.toString()
        val altura5=altura.toFloat()
        val peso5= peso.toDouble()
        mainViewModel.cal(peso5,altura5)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)
        mainViewModel= ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.imagendata.observe(this) { imag ->
            mainBinding.imageView2.setImageResource(imag)
        }

        with(mainBinding){
            floatingActionButton.setOnClickListener{
                act()
            }
            imageButton4.setOnClickListener{
                act()
            }
            imageButton2.setOnClickListener{
                act()
            }
        }

    }
}

