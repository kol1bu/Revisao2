package com.example.revisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNome:TextView = findViewById(R.id.edtNome)
        val txtEndereco:TextView = findViewById(R.id.edtEndereco)
        val txtBairro:TextView = findViewById(R.id.edtBairro)
        val txtCEP:TextView = findViewById(R.id.edtCep)
        val txtCidade:TextView = findViewById(R.id.edtCidade)
        val edtNome: TextView = findViewById(R.id.edtNome)

        val btnCadastrar:Button = findViewById(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener {
            //Toast.makeText(this, "Nome: " + txtNome.text.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, Resultado::class.java)

            intent.putExtra("nome", edtNome.text.toString())
            startActivity(intent)
        }

    }
}