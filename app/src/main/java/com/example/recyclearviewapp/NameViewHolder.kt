package com.example.recyclearviewapp

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclearviewapp.databinding.ItemNameBinding


class NameViewHolder(private val binding: ItemNameBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(name: String) {
        binding.nametv.text = name
    }
}