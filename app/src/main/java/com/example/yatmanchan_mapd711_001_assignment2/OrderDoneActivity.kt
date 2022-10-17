package com.example.yatmanchan_mapd711_001_assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.yatmanchan_mapd711_001_assignment2.R.*

class OrderDoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_order_done)

        val m = intent
        val modelSelectedFinal= m.getStringExtra("modelSelected")
        val colorSelectedFinal = m.getStringExtra("Message")
        val storageSelectedFinal = m.getStringExtra("selectedStorage")

        val confirmedModel = findViewById<TextView>(R.id.confirmedModel)
        val confirmedSpecs = findViewById<TextView>(R.id.confirmedSpecs)
        val confirmedPersonalInfo =findViewById<TextView>(R.id.confirmedPersonalInfo)


        confirmedModel.text = modelSelectedFinal
        confirmedSpecs.text = colorSelectedFinal
        confirmedPersonalInfo.text = storageSelectedFinal

    }


}