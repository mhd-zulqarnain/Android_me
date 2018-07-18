package com.example.zulqarnain.andro_me

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.zulqarnain.andro_me.data.Utils
import com.example.zulqarnain.andro_me.ui.BodyPartFragment
import com.example.zulqarnain.andro_me.ui.HeadPartFragment
import com.example.zulqarnain.andro_me.ui.LegPartFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bodyFragment:BodyPartFragment = BodyPartFragment()
        val legFragment:LegPartFragment = LegPartFragment()
        val headFragment:HeadPartFragment = HeadPartFragment()

        supportFragmentManager.beginTransaction().
                add(R.id.head_container,headFragment).
                add(R.id.body_container,bodyFragment).
                add(R.id.leg_container,legFragment).
                commit()

    }
}
