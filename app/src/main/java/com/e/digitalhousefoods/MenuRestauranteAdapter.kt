package com.e.digitalhousefoods

import android.view.LayoutInflater
import android.view.OrientationEventListener
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuRestauranteAdapter(private val listaPratos: MutableList<Prato>, val listener: onPratoClickListener) : RecyclerView.Adapter<MenuRestauranteAdapter.PratosViewhHolder>() {

    //infla layout do item na recyclerview
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
    }


    //pega tamanho da lista
    override fun getItemCount() = listaPratos.size


    //interface do evendo de click
    interface onPratoClickListener {
        fun pratoClick(position: Int)
    }




    inner class PratosViewhHolder (itemView : View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        //para que toda a view seja clicavel
        init {
            itemView.setOnClickListener(this)
        }

        //montando a view
        val nomePrato : TextView = itemView.findViewById(R.id.item_prato_nome)
        val imagemPrato : ImageView = itemView.findViewById(R.id.item_prato_img)


        override fun onClick(v: View?) {
            val positionPrato = adapterPosition
            if (RecyclerView.NO_POSITION != position)
                listener.pratoClick(position)
        }

    }
}