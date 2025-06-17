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
    lateinit var celebAdapter: CelebAdapter;


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        nameAdapter = NameAdapter()
        nameAdapter.submitList(nameList)
celebAdapter=CelebAdapter()
        celebAdapter.submitList(clebList)


        binding.nameRCV.adapter = celebAdapter
    }
}
