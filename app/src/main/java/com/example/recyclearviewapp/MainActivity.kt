package com.example.recyclearviewapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclearviewapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val nameList = listOf("Mehedi", "Masum", "Avijit", "Mehedi", "Masum", "Avijit","Mehedi", "Masum", "Avijit", "Mehedi", "Masum", "Avijit")
    val clebList= listOf<Celeb>(Celeb("Priyanka Chopra Jonas","Priyanka Chopra Jonas (née Chopra) was born on July 18, 1982 in Jamshedpur, India, to the family of Capt. Dr. Ashok Chopra and Dr. Madhu Chopra, both Indian Army physicians. She had a very varied upbringing.","https://www.imdb.com/name/nm1231899/mediaviewer/rm2819207936/?ref_=nm_ov_ph"))
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
