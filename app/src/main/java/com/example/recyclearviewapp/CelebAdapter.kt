package com.example.recyclearviewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil

class CelebAdapter :ListAdapter<Celeb,CelebViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CelebViewHolder {


    }

    override fun onBindViewHolder(holder: CelebViewHolder, position: Int) {

    }

companion object{
    val comparator= object: DiffUtil.ItemCallback<Celeb>(){
        override fun areItemsTheSame(oldItem: Celeb, newItem: Celeb): Boolean {
            TODO("Not yet implemented")
        }

        override fun areContentsTheSame(oldItem: Celeb, newItem: Celeb): Boolean {
            TODO("Not yet implemented")
        }


    }
}

}