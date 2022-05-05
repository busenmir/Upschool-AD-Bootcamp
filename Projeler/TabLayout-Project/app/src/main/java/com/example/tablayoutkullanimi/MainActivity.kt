package com.example.tablayoutkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayoutkullanimi.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private val fragmentListesi = ArrayList<Fragment>()
    private val fragmentBaslikListesi = ArrayList<String>()
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        fragmentListesi.add(Fragment1())
        fragmentListesi.add(Fragment2())
        fragmentListesi.add(Fragment3())

        val adapter = ViewPagerAdapter(this)
        binding.viewPager2.adapter = adapter

        fragmentBaslikListesi.add("Android")
        fragmentBaslikListesi.add("IOS")
        fragmentBaslikListesi.add("Flutter")

        TabLayoutMediator(binding.tabLayout,binding.viewPager2){tab, position ->
            tab.setText(fragmentBaslikListesi[position])
        }.attach()
        binding.tabLayout.getTabAt(0)!!.setIcon(R.drawable.resim)
        binding.tabLayout.getTabAt(1)!!.setIcon(R.drawable.ioss)
        binding.tabLayout.getTabAt(2)!!.setIcon(R.drawable.flt)

    }


    inner class ViewPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity){
        override fun getItemCount(): Int {
            return fragmentListesi.size
        }

        override fun createFragment(position: Int): Fragment {
            return fragmentListesi[position]
        }

    }
}