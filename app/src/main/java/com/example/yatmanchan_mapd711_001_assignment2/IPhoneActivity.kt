package com.example.yatmanchan_mapd711_001_assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class IPhoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iphone)

        val listView: ListView = findViewById(R.id.iphonelist)

        val iphones = arrayOf<String>("iPhone14","iPhone14 Pro Max","iPhone14 Pro")

        val iPhoneList = ArrayList<String>(listOf(*iphones))  // StringArray

        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, iPhoneList)

        val e = Intent(this@IPhoneActivity, SpecActivity::class.java)

        listView.adapter = arrayAdapter
        val submitiPhoneModel = findViewById<View>(R.id.submitModel1)  //an obj
        listView.setOnItemClickListener { parent, _, position, _ ->
            val iphoneModelSelected = parent.getItemAtPosition(position) as String
            Toast.makeText(this,"Selected item is $iphoneModelSelected", Toast.LENGTH_LONG).show()
        submitiPhoneModel.setOnClickListener {
            startActivity(e)
            e.putExtra("modelSelected", iphoneModelSelected)

        }
        }
    }

}