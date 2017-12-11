package com.example.katiuska.listview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.CheckBox
import android.view.LayoutInflater





/**
 * Created by katiuska on 12/6/17.
 */

class MyAdapter(val items: List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>(){
    var context =null as Context?

    @Override
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(items[position] == "banana") {
            holder.view.botto
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        this.context = parent.context
        return ViewHolder(View(parent.context))
    }

    override fun getItemCount(): Int =  items.size


    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)


}


