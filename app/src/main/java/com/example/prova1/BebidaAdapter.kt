package com.example.prova1

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class BebidaAdapter (private val context: Context,
                     private val bebidas: List<Bebidas>?,
                     private val onClickListener: BebidaOnClickListener): RecyclerView.Adapter<BebidaAdapter.BebidaViewHolder>() {

    interface BebidaOnClickListener{
        fun  onClickBebida(holder: BebidaViewHolder?, idx: Int)
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int):
            BebidaViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_bebidas,
            viewGroup, false)
        return BebidaViewHolder(view)
    }
    override fun getItemCount(): Int = bebidas!!.size

    override fun onBindViewHolder(holder: BebidaViewHolder,
                                  position: Int) {
        val bebida = bebidas!![position]
        holder.tNome.text = bebida.nome
        holder.itemView.setOnClickListener {
            onClickListener.onClickBebida(holder, position)
        }
    }
    class BebidaViewHolder(view: View): RecyclerView.ViewHolder(view)
    {
        val img: ImageView = view.findViewById(R.id.img)
        var tNome: TextView = view.findViewById(R.id.tNome)
    }

}