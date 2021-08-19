package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(
    var contacts: List<Contact>): RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {


    inner class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact,parent,false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.itemView.apply{
            holder.itemView.findViewById<TextView>(R.id.tvContact).text = contacts[position].name
            holder.itemView.findViewById<TextView>(R.id.tvNumber).text = contacts[position].number
        }

    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}