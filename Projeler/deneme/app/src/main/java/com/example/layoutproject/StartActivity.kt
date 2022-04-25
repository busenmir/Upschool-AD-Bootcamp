package com.example.layoutproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.layoutproject.databinding.ActivityMainBinding
import com.example.layoutproject.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_start)
        binding.startNesnesi=this
        buttonTikla2()

    }
    fun buttonTikla2(){
        val intent = Intent(this@StartActivity,PremiumActivity::class.java)
        startActivity(intent)
    }
}