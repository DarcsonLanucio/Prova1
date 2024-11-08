package com.example.prova1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListInicAdapter (private val context: Context, private val itens: List<ListInic>): BaseAdapter() {

    override fun getCount(): Int {
        return itens.size
    }

    override fun getItem(position: Int): Any {
        return itens[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view =  convertView ?: LayoutInflater.from(context).inflate(R.layout.activity_adapter_list_inic,parent, false)
        val tNome = view.findViewById<TextView>(R.id.nomeList)

        val item = itens[position]
        tNome.text = item.nome

        return view
    }


}