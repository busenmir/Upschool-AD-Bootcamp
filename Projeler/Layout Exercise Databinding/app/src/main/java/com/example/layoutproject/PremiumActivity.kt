package com.example.layoutproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.layoutproject.databinding.ActivityPremiumBinding
import com.example.layoutproject.databinding.ActivityStartBinding

class PremiumActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityPremiumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_premium)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_premium)

        binding.PreButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this@PremiumActivity,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}