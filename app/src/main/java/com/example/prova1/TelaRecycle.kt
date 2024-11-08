package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TelaRecycle : AppCompatActivity() {
    private lateinit var recycloView: RecyclerView
    private var bebidas: List<Bebidas>? = emptyList()
    private lateinit var adapter: BebidaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_recycle)
        recycloView = findViewById(R.id.recicleView)
        recycloView.layoutManager = LinearLayoutManager(this)
        recycloView.itemAnimator = DefaultItemAnimator()
        recycloView.setHasFixedSize(true)

        bebidas = Bebidas.BebidasData.getBebidas()

        adapter = BebidaAdapter(this, bebidas, onClickBebida())
        recycloView.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun onClickBebida(): BebidaAdapter.BebidaOnClickListener {
        return object : BebidaAdapter.BebidaOnClickListener {
            override fun onClickBebida(holder: BebidaAdapter.BebidaViewHolder?, idx: Int)
            {
                val bebida = bebidas?.getOrNull(idx) ?: return

                val intent = Intent(baseContext, BebidaDesc::class.java)

                val img: ImageView = holder!!.img
                intent.putExtra("imgBebida", bebida.img)



            }
        }
    }
}