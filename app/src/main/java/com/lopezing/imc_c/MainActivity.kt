package com.lopezing.imc_c

import android.app.Activity

import android.os.Bundle

import com.lopezing.imc_c.databinding.ActivityMainBinding
import java.lang.Math.pow
import java.util.*
import kotlin.math.pow

class MainActivity : Activity() {
    private lateinit var mainBinding: ActivityMainBinding
    private var tot:Double=0.0
    fun act(){
        val peso = mainBinding.textIp.text.toString()
        val altura = mainBinding.textIa.text.toString()
        val altura5=altura.toFloat()
        val peso5= peso.toDouble()
        //cal()
        tot =peso5/(altura5.pow(2).toDouble())
        if (tot<18.5)mainBinding.imageView2.setImageResource(R.drawable.img_f)
        if (tot>18.5 && tot<=25)mainBinding.imageView2.setImageResource(R.drawable.img_n)
        if (tot>25)mainBinding.imageView2.setImageResource(R.drawable.img_g)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)
        with(mainBinding){
            floatingActionButton.setOnClickListener{
                act()
                //imageView2.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.img_f));
                //imageView2.setImageResource(R.drawable.img_f);
                //imageButton2.setImageResource(R.drawable.button_f);
                //imageButton4.setImageIcon(R..buttonf);
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

