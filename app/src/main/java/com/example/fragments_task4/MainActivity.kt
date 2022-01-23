package com.example.fragments_task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.fragments_task4.adapter.ViewPagerAdapter
import com.example.fragments_task4.fragment.FirstFragment
import com.example.fragments_task4.fragment.SecondFragment
import com.example.fragments_task4.fragment.ThirdFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }
    private fun initViews() {
        viewPager = findViewById(R.id.view_pager)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.add(FirstFragment(),"Page 1")
        viewPagerAdapter.add(SecondFragment(),"Page 2")
        viewPagerAdapter.add(ThirdFragment(),"Page 3")

        viewPager.adapter = viewPagerAdapter
        tabLayout = findViewById(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)
    }
}