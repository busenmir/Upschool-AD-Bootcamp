package com.example.upschool3

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.widget.Toast
import androidx.constraintlayout.motion.widget.Key.VISIBILITY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            Toast.makeText(this, "Güneş Doğuyor", Toast.LENGTH_LONG).show()
            alphaAnimasyonu()
            alphaAnimasyonu()
        }
        button2.setOnClickListener{
            ivmeAnimasyonu()
        }
        button3.setOnClickListener{
            Toast.makeText(this, "Zıplıyoruz !", Toast.LENGTH_LONG).show()
            sekmeAnimasyonu()
        }
        button4.setOnClickListener{
            scaleAnimasyonu()
        }
        button.setOnClickListener{
            rotateAnimasyonu()
        }
    }
    fun alphaAnimasyonu(){
        val alpha = ObjectAnimator.ofFloat(imageView,"alpha",0.0f,1.0f).apply{
            duration=3000
        }
        alpha.start()
    }
    fun ivmeAnimasyonu(){
        val ivme = ObjectAnimator.ofFloat(imageView,"translationY",0.0F,300.0F).apply {
            duration = 1000
            interpolator = BounceInterpolator()
        }
        ivme.start()
    }
    fun sekmeAnimasyonu(){
        val sekme=ObjectAnimator.ofFloat(imageView,"translationY",0.0f,100.0f).apply{
            duration = 1000
            repeatCount = ObjectAnimator.INFINITE
            repeatMode = ObjectAnimator.REVERSE
        }
        sekme.start()
    }
    fun scaleAnimasyonu(){
        val scale = ObjectAnimator.ofFloat(imageView,"scaleY",1.0F,2.0F).apply {
            duration = 2000
        }
        scale.start()
    }
    fun rotateAnimasyonu(){
        val rotate = ObjectAnimator.ofFloat(imageView,"rotation",0.0f,180.0f).apply{
            duration = 3000
        }
        rotate.start()
    }

}