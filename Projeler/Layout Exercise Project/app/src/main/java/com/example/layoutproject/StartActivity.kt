package com.example.layoutproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.layoutproject.databinding.ActivityMainBinding
import com.example.layoutproject.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_start)

        binding.signInButton.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            binding.signInButton.id -> {
                val intent = Intent(this, PremiumActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}