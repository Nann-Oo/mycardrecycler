package com.example.recycleviewex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleviewex1.adapter.Adapterprice
import com.example.recycleviewex1.model.Itemname
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var itemArray = ArrayList<Itemname>()
        itemArray.add(Itemname("Fine Grain Sugar","$20.00","1Kg",R.drawable.sugar))
        itemArray.add(Itemname("Peanutus","$20.00","3Kg",R.drawable.peanuts))
        itemArray.add(Itemname("Dawat Rice","$80.00","2Kg",R.drawable.dawat))
        var adapterprice =Adapterprice(itemArray)
        recyclerview.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerview.adapter=adapterprice
    }
}
