package com.example.recyclearviewapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.recyclearviewapp.databinding.ActivityFullBinding
import com.example.recyclearviewapp.databinding.ActivityMainBinding

class FullActivity : AppCompatActivity() {
    lateinit var binding: ActivityFullBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityFullBinding.inflate(layoutInflater)
        setContentView(binding.root)
var imageLink=intent.getStringExtra("img")
Glide.with(this@FullActivity).load(imageLink).into(binding.imageFulltv)
    }
}