package com.magere.architecturecomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var liveData = DataController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        liveData.getData().observe(this, Observer {
            tv_live_data.text = it.toString()
        })

        btn_add_data.setOnClickListener {
            liveData.addData("Some value")
        }

    }
}
