package com.example.agenda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.agenda.databinding.ActivityAgendaBinding
import com.example.agenda.databinding.ActivityAgendaBinding.inflate
import com.example.agenda.databinding.ActivityMainBinding
import com.example.agenda.databinding.ActivityMostrarBinding

class Mostrar : AppCompatActivity() {
    private lateinit var binding: ActivityMostrarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMostrarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = ArrayList<ActivityAgendaBinding>()

        //variable para recibir todos los extras
        val parExtra = intent.extras
        //variables que recibimos todos los extras
        val msje = parExtra?.getString("mensaje")
        val nombre = parExtra?.getString("nombre")

        binding.txtNamee.text=nombre.toString()

            binding.btnSalir.setOnClickListener {
                val intento2 = Intent(this, MainActivity::class.java)
                //intento2.putExtra("valor1","Hola mundo")
                startActivity(intento2)
                // adapter.notifyItemInserted(insertIndex)
            }
        }

    }
