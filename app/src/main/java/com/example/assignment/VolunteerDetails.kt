package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class VolunteerDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volunteer_details)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val i = intent
        val img = i.getStringExtra("img")
        val title = i.getStringExtra("title")
        val date = i.getStringExtra("date")
        val desc = i.getStringExtra("description")
        val price = i.getStringExtra("progress")
        val location = i.getStringExtra("location")
        val phoneno = i.getStringExtra("phonenumber")

        var itemimg: ImageView = findViewById(R.id.itemImg)
        var titletext: TextView = findViewById(R.id.title)
        var datetext: TextView = findViewById(R.id.date)
        var desctext: TextView = findViewById(R.id.description)
        var pricetext: TextView = findViewById(R.id.price)
        var locationtext: TextView = findViewById(R.id.location)
        var phonetext: TextView = findViewById(R.id.phonenumber)


        Picasso.with(this).load(img).into(itemimg)
        titletext.text = title
        datetext.text = date
        desctext.text = desc
        pricetext.text = price
        locationtext.text = location
        phonetext.text = phoneno
        var button: Button = findViewById(R.id.donate)
    }

}
