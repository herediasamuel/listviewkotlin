package com.example.katiuska.listview

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by katiuska on 12/6/17.
 */

class MyAdapter(val items: List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>(){


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int =  items.size


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}