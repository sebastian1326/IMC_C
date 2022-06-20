package com.lopezing.imc_c.ui.Main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lopezing.imc_c.R
import kotlin.math.pow

class MainViewModel:ViewModel() {
    private var img=0
    private var tot=0.0
    private val imag: MutableLiveData<Int> = MutableLiveData()
    val imagendata: LiveData<Int> = imag
    fun cal(x: Double, y: Float) {
        tot =x/(y.pow(2).toDouble())
        if (tot<18.5) img = R.drawable.img_f
        if (tot>18.5 && tot<=25)img = R.drawable.img_n
        if (tot>25)img = R.drawable.img_g
        imag.value=img
    }

}