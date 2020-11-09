package com.e.digitalhousefoods.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.e.digitalhousefoods.MenuRestauranteAdapter
import com.e.digitalhousefoods.Prato
import com.e.digitalhousefoods.R
import kotlinx.android.synthetic.main.fragment_lista_pratos.*
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
        val view = inflater.inflate(R.layout.fragment_lista_pratos, container, false)

        //passar imagem pela intent?
        //view.frag_lista_pratos_imagemRest.setImageResource()

        //montando a recycler view
        view.frag_lista_pratos_recyclerview.adapter = adapPratos
        view.frag_lista_pratos_recyclerview.layoutManager = GridLayoutManager(context, 2)
        view.frag_lista_pratos_recyclerview.setHasFixedSize(true)

        return view

    }

    override fun pratoClick(position: Int) {
        Toast.makeText(context, "Prato clicado", Toast.LENGTH_SHORT).show()
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

