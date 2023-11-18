package com.willan_diaz.asesor_juridico_virtual.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.willan_diaz.asesor_juridico_virtual.R
import com.willan_diaz.asesor_juridico_virtual.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding  //Enlace entre variable y layout [}
    // en la variable binding está TODO el layout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  //recupera una instancia anterior.

        //BINDING
        binding = ActivityLoginBinding.inflate(layoutInflater) // Inflador por defecto de la clase. Inflar = convertir de texto (XML) a objeto.(a partir de esto ya se puede usar el Listener, etc.)
        setContentView(binding.root)

        var editTextUsuario = findViewById<EditText>(R.id.editTextUsuario1)
        var btnLogin = findViewById<Button>(R.id.btnLogin)
    }


    override fun onStart() {
        super.onStart()
        initControls()


    }

    fun initControls(){


        binding.btnLogin.setOnClickListener {
            var u = binding.editTextUsuario1.text.toString()
            var c = binding.txtContrasena.text.toString()

            if (u == "juan" && c == "123" ){
/*
                Toast.makeText(this, "USUARIO VALIDO", Toast.LENGTH_LONG).show()
*/
                Snackbar.make(binding.btnLogin, "USUARIO VALIDO", Snackbar.LENGTH_SHORT).show()
            }else{
/*
                Toast.makeText(this, "USUARIO INVALIDO!!", Toast.LENGTH_LONG).show()
*/
                Snackbar.make(binding.btnLogin, "USUARIO INVALIDO!!!", Snackbar.LENGTH_SHORT).show()

            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}