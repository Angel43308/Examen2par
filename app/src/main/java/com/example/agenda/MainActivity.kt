package com.example.agenda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.agenda.databinding.ActivityMainBinding
import android.widget.Toast
import com.example.agenda.databinding.ActivityMostrarBinding
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var indice: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var data = ArrayList<Agenda>()
        val intento1 = Intent(this, MainActivity::class.java)


        val parExtra = intent.extras
        var txtNom = binding.txtNombre.text
        var txtCont = binding.txtControl.text
        var txtPos = binding.txtPos.text
        var poss =

        //boton de agregar -------------------------------------------------------------------------
        binding.btnAgregar.setOnClickListener {

            val insertIndex:Int=data.count()

            if ((txtNom.length == 0) || (txtCont.length ==0)){
                Toast.makeText(this, "Campos incompletos", Toast.LENGTH_LONG).show()
            } else {
                data.add(insertIndex, Agenda("${txtNom}","${txtCont}"))
            }

            indice =+ 1
           // position =+ 1
            binding.txtContactos.text="Control: $indice"
            binding.txtNombre.text.clear()
            binding.txtControl.text.clear()

        } //TERMINA BOTON AGREGAR ------------------------------------------------------------------

        //txtPos.toIntOrNull()
        //assertThrows<NumberFormatException> {txtPos.toString()}
        //val x: Int = txtPos.toInt()
        //val x: Int = Interger.parseInt(txtPos)
        //val x: Int? = txtPos.toInt()
        //val x = (1+txtPos)
        //kotlin.Int()
        //String.to

        binding.btnAgenda.setOnClickListener {
            val intento1 = Intent(this, Mostrar::class.java)
            intento1.putExtra("mensaje", "nuevo")
            intento1.putExtra("nombre", "${data.get(0).nombre}")

            startActivity(intento1)

        }



    }
}