package com.example.recyclerviewexample

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample.databinding.ActivityMainBinding
import com.example.recyclerviewexample.databinding.ItemContactBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var contactList = mutableListOf(
            Contact("David","3006603528"),
            Contact("Juan","5848484884"),
            Contact("Felipe","71848488484"),
            Contact("Jaime","3108484484"),
            Contact("Ron","315767373838"),
            Contact("Joan","3004575858"),
            Contact("Lionel","60036363733"),
            Contact("Gabriel Omar","2701181")
        )

        val adapter = ContactAdapter(contactList)

        binding.rvContactList.adapter = adapter
        binding.rvContactList.layoutManager = LinearLayoutManager(this)

        binding.btnAddContact.setOnClickListener {

            val name = binding.etContact.text.toString()
            val number = binding.etNumber.text.toString()
            val contact = Contact(name,number)
            contactList.add(contact)
            adapter.notifyItemInserted(contactList.size-1)

        }
    }


}