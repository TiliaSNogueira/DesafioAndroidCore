package com.e.digitalhousefoods.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.e.digitalhousefoods.adapter.MenuRestauranteAdapter
import com.e.digitalhousefoods.modelo.Prato
import com.e.digitalhousefoods.R
import kotlinx.android.synthetic.main.fragment_lista_pratos.view.*

class ListaPratosFragment : Fragment(), MenuRestauranteAdapter.onPratoClickListener {

    //lista estática dos pratos
    val listaPratos: MutableList<Prato> = getPratos()

    //adapter
    val adapPratos = MenuRestauranteAdapter(listaPratos, this)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewCriada = inflater.inflate(R.layout.fragment_lista_pratos, container, false)

        //montando a recycler view
        viewCriada.frag_lista_pratos_recyclerview.adapter = adapPratos
        viewCriada.frag_lista_pratos_recyclerview.layoutManager = GridLayoutManager(context, 2)
        viewCriada.frag_lista_pratos_recyclerview.setHasFixedSize(true)

        return viewCriada

    }

    override fun pratoClick(position: Int) {
        Toast.makeText(context, "Prato clicado", Toast.LENGTH_SHORT).show()
        findNavController().navigate(R.id.action_listaPratosFragment_to_detalhesPrato)

    }


}


fun getPratos(): MutableList<Prato> {
    return mutableListOf(
        Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre", R.drawable.imgaoyama)
    )

}

