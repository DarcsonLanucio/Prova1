package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listInic)
        val itemInic = ListInic.ListInicData.getList()
        listView.adapter = ListInicAdapter(this, itemInic)

        listView.onItemClickListener = this

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val item = parent!!.getItemAtPosition(position) as ListInic
        if (item.nome == "Comida"){
            Toast.makeText(this, "Ainda não servimos comida", Toast.LENGTH_SHORT).show()
        }
        else if(item.nome == "Mercearia"){
            Toast.makeText(this, "Ainda não trabalhamos com mercearia", Toast.LENGTH_SHORT).show()
        }
        else{
            val intent = Intent(this, TelaRecycle:: class.java )
            startActivity(intent)
        }
    }
}