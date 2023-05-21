package com.d3if3048.assesment1.Main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.d3if3048.assesment1.R
import com.d3if3048.assesment1.TranslateViewModel
import com.d3if3048.assesment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: TranslateViewModel
    private lateinit var navController: NavController
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(TranslateViewModel::class.java)
        databaseHelper = DatabaseHelper(this)

        viewModel.indonesianText.observe(this, Observer { translation ->
            binding.editTextIndo.setText(translation)
        })

        binding.buttonTranslate.setOnClickListener {
            val germanText = binding.editTextGerman.text.toString().trim().lowercase()
            if (germanText.isNotEmpty()) {
                viewModel.translate(germanText)
            }
        }

        binding.buttonSave.setOnClickListener {
            val germanText = binding.editTextGerman.text.toString().trim()
            if (germanText.isNotEmpty()) {
                val insertedId = databaseHelper.simpanKata(germanText)
                if (insertedId != -1L) {
                    Toast.makeText(this, "Kata berhasil disimpan", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Gagal menyimpan kata", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Mohon masukkan kata sebelum menyimpan", Toast.LENGTH_SHORT).show()
            }
        }

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.container) as? NavHostFragment
        navController = navHostFragment?.navController ?: return

        binding.buttonAbout.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_aboutFragment)
        }
    }
}