package com.example.layoutproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.layoutproject.databinding.ActivityPremiumBinding
import com.example.layoutproject.databinding.ActivityStartBinding

class PremiumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPremiumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_premium)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_premium)
        binding.premiumNesnesi=this
        buttonTikla3()

    }
    fun buttonTikla3(){
        val intent = Intent(this@PremiumActivity,MainActivity::class.java)
        startActivity(intent)
    }
}