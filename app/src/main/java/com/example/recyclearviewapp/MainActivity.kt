package com.example.recyclearviewapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclearviewapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val nameList = listOf("Mehedi", "Masum", "Avijit", "Mehedi", "Masum", "Avijit","Mehedi", "Masum", "Avijit", "Mehedi", "Masum", "Avijit")
    val clebList= listOf<Celeb>(Celeb("Priyanka Chopra Jonas", priyankabio,profileimg),
        Celeb("Ananya Panday",annabio,annaimg),
        Celeb("Janhvi Kapoor",janvibio,janviimg),
        Celeb("Rashmika Mandanna",rasbio,rashimg),




        )





    private lateinit var nameAdapter: NameAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        nameAdapter = NameAdapter()
        binding.nameRCV.adapter = nameAdapter
        nameAdapter.submitList(nameList)
    }
}
