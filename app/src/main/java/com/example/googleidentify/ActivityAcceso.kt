package com.example.googleidentify

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityAcceso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_acceso)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtener el nombre de usuario pasado como extra
        val userName = intent.getStringExtra("USER_NAME")

        // Encontrar el TextView en el diseño
        val textViewNombre = findViewById<TextView>(R.id.Nombre)

        // Configurar el texto del TextView con el nombre de usuario
        textViewNombre.text = "Bienvenido $userName"
    }
}
