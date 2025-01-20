package com.example.myapplication111


import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val nameText: TextView = view.findViewById(R.id.nameText)
}