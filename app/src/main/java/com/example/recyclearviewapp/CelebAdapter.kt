package com.example.recyclearviewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.recyclearviewapp.databinding.CelebBinding


class CelebAdapter : ListAdapter<Celeb, CelebViewHolder>(comparator) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CelebViewHolder {
val binding=CelebBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return CelebViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CelebViewHolder, position: Int) {
getItem(position).let {
    holder.binding.nametv.text=it.name
    holder.binding.biotv.text=it.bio


}


    }

    companion object {
        val comparator = object : DiffUtil.ItemCallback<Celeb>() {
            override fun areItemsTheSame(oldItem: Celeb, newItem: Celeb): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: Celeb, newItem: Celeb): Boolean {
                return oldItem == newItem
            }
        }
    }
}
