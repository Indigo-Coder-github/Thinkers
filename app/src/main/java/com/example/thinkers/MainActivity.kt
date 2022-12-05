package com.example.thinkers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager_Banner.adapter = ViewPagerAdapter(getBannerList())
        viewPager_Banner.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        var topEventList = arrayListOf<TopEvent>()
    }

    private fun getBannerList():ArrayList<Int>{
        return arrayListOf<Int>(R.drawable.bannerimgsample1)
    }
}