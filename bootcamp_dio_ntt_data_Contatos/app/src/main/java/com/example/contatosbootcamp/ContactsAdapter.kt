package com.example.contatosbootcamp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val contactList: ArrayList<Contact>) :
    RecyclerView.Adapter<ContactsAdapter.ViewHOlder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHOlder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_view, parent,
            false)
    }

    override fun onBindViewHolder(holder: ContactsAdapter.ViewHOlder, position: Int) {
        holder.bindItem(contactList[position])
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

}