package com.example.revisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val edtResultado: EditText = findViewById(R.id.edtResultado)
        val intent = intent
        val inputNome = intent.getStringExtra("nome")

        edtResultado.setText("Nome: " + inputNome.toString())

        val btnVoltar: Button = findViewById(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            //Toast.makeText(this, "Nome: " + txtNome.text.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}