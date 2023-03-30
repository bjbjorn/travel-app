package com.example.travelapp;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView;
import be.kuleuven.recyclerview.model.Todo

class Recycler(val items: List<Todo>) : RecyclerView.Adapter<Recycler.RecyclerViewHolder>() {

    inner class RecyclerViewHolder(currentItemView: View) : RecyclerView.ViewHolder(currentItemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler, parent, false)
            return RecyclerViewHolder(view)

    }
    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        // bind the data to our items: set the todo text view text and checked state accordingly
        val currentTodoItem = items[position]
        holder.itemView.apply {
            findViewById<TextView>(R.id.textView2).text = currentTodoItem.title
            findViewById<CheckBox>(R.id.checkBox).isChecked = currentTodoItem.isDone
        }
    }

    override fun getItemCount(): Int = items.size


}
