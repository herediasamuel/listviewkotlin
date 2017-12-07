package com.example.katiuska.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import org.jetbrains.anko.find

class MainActivity : AppCompatActivity() {

    private val fruits  =  listOf<String>("banana", "apple", "strawberry", "kiwi", "watermelon",
            "pineaple", "orange")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myRecyclerView : RecyclerView = find(R.id.my_recycler_view)
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        myRecyclerView.adapter = MyAdapter(fruits)
    }
}
