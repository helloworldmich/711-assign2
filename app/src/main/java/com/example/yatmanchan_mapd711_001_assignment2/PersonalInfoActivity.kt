package com.example.yatmanchan_mapd711_001_assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.yatmanchan_mapd711_001_assignment2.R.id.storage_details

class PersonalInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_info)
//        val intent2= intent
//        val selectedModel = intent2.getStringExtra("modelSelected")

        val intent = intent
        val message = intent.getStringExtra("Message")  //color selected
        val selectedStorage = intent.getStringExtra("selectedStorage")
        val selectedModel = intent.getStringExtra("modelSelected")


        val textView = findViewById<TextView>(R.id.selected_spec)
        val storageDetails = findViewById<TextView>(storage_details)
        val modelSelected= findViewById<TextView>(R.id.model_selected)

        modelSelected.text = selectedModel
        textView.text = message
        storageDetails.text = selectedStorage

        val k= Intent(this@PersonalInfoActivity, OrderDoneActivity::class.java)
        val cardholdername = findViewById<TextView>(R.id.cardHolderName)
        val add = findViewById<TextView>(R.id.add)
        val postalcode = findViewById<TextView>(R.id.postalcode)
        val tel = findViewById<TextView>(R.id.tel)
        val creditcardnum = findViewById<TextView>(R.id.creditcardnum)
        val expiration = findViewById<TextView>(R.id.expiration)
        val cvc = findViewById<TextView>(R.id.cvc)

        val submitOrder = findViewById<View>(R.id.confirmOrder) as Button
        submitOrder.setOnClickListener{
            if (cardholdername.text !=null){
startActivity(k)
            }
        }
    }

}