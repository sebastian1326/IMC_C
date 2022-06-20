package com.lopezing.imc_c.ui.Splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lopezing.imc_c.R

import android.app.Activity
import android.content.Intent
import com.lopezing.imc_c.databinding.ActivitySplashBinding
import com.lopezing.imc_c.ui.Main.MainActivity

import java.util.*
import kotlin.concurrent.timerTask

class SplashActivity : Activity() {
    private lateinit var splashBinding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashBinding=ActivitySplashBinding.inflate(layoutInflater)
        val view=splashBinding.root
        setContentView(view)

        val timer= Timer()
        timer.schedule(
            timerTask {
                goToMainActivity()
            },1000
        )
    }
    private fun goToMainActivity(){
        val intent= Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}