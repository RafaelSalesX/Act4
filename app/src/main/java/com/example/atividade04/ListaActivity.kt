package com.example.atividade04

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)
        setSupportActionBar(findViewById(R.id.tbrLista))
        setTitle("@Contact List")

        val contatos = arrayOf("One ", "Two", "Three" , "For")
        var adaptador = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, contatos)

        val lista = findViewById<ListView>(R.id.lstLista)
        lista.adapter = adaptador

        val button = findViewById<FloatingActionButton>(R.id.fabAdicionar)
        button.setOnClickListener {
            val intencao = Intent(applicationContext, CadastroActivity::class.java)
            startActivity(intencao)
        }

        val butt = findViewById<FloatingActionButton>(R.id.floActBtn)
        butt.setOnClickListener {
            val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }
    }

}