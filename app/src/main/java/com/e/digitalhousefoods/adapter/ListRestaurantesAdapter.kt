package com.e.digitalhousefoods.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.e.digitalhousefoods.R
import com.e.digitalhousefoods.domain.Restaurante

class ListRestaurantesAdapter(
    private val listaRestaurantes: MutableList<Restaurante>,
    val listener: OnRestauranteClickListener
) :
    RecyclerView.Adapter<ListRestaurantesAdapter.RestaurantesViewHolder>() {

    //pega o item restaurante e infla no layout da recyclerview
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantesViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_restaurante, parent, false)
        return RestaurantesViewHolder(itemView)
    }

    //vincula dados ao layout de cada item da recyclerview
    override fun onBindViewHolder(holder: RestaurantesViewHolder, position: Int) {
        //pega a posição do item na lista
        var restaurante = listaRestaurantes[position]

        //vincula os dados
        holder.nomeRestaurante.text = restaurante.nome
        holder.enderecoRestaurante.text = restaurante.endereco
        holder.horarioRestaurante.text = restaurante.horario
        holder.imagemRestaurante.setImageResource(restaurante.imagem)

        //evento de click no item vai chamar o metodo da interface que sera implementado na listaDeRestaurantesFragment
        holder.itemView.setOnClickListener {
            listener.restauranteClick(position)
        }

    }

    //pega o tamanho da lista
    override fun getItemCount() = listaRestaurantes.size

    //interface que comunica com listaDeRestaurantesFragment
    interface OnRestauranteClickListener {
        fun restauranteClick(position: Int)
    }

    inner class RestaurantesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //jogando os itens do layout da view para variaveis que possamos manipular
        var nomeRestaurante: TextView = itemView.findViewById(R.id.item_tv_nomeRestaurante)
        val enderecoRestaurante: TextView = itemView.findViewById(R.id.item_tv_endereco)
        val horarioRestaurante: TextView = itemView.findViewById(R.id.item_tv_horario)
        val imagemRestaurante: ImageView = itemView.findViewById(R.id.item_img_rest)
    }
}


