package com.e.digitalhousefoods.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.e.digitalhousefoods.R
import com.e.digitalhousefoods.modelo.Prato

class MenuRestauranteAdapter(private val listaPratos: MutableList<Prato>, val listener: onPratoClickListener) : RecyclerView.Adapter<MenuRestauranteAdapter.PratosViewhHolder>() {

    //infla layout do item prato na recyclerview
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratosViewhHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_prato, parent, false)
        return PratosViewhHolder(itemView)
    }

    //vincula layout e dados
    override fun onBindViewHolder(holder: PratosViewhHolder, position: Int) {
        //pegando cada prato da lista
        var prato = listaPratos[position]

        //vinculando os dados
        holder.imagemPrato.setImageResource(prato.imagem)
        holder.nomePrato.text = prato.nome

        holder.itemView.setOnClickListener{
           listener.pratoClick(position)
        }

    }

    //pega tamanho da lista
    override fun getItemCount() = listaPratos.size


    //interface do evento de click que será implementada na listaDePratosFragment
    interface onPratoClickListener {
        fun pratoClick(position: Int)
    }


    inner class PratosViewhHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        //pegando os campos do layout e transformando em variaveis para manipularmos
        val nomePrato : TextView = itemView.findViewById(R.id.item_prato_nome)
        val imagemPrato : ImageView = itemView.findViewById(R.id.item_prato_img)


    }
}