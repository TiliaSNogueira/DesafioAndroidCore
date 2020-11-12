package com.e.digitalhousefoods.ui

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.e.digitalhousefoods.R
import com.e.digitalhousefoods.adapter.MenuRestauranteAdapter
import com.e.digitalhousefoods.modelo.Prato
import com.e.digitalhousefoods.modelo.Restaurante
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


        //colocando evento de click no navigationIcon
        view.lista_pratos_fragment_toolbar.setNavigationOnClickListener {
            //mapa que voltta pra lista de restaurantes
            findNavController().navigate(R.id.action_listaPratosFragment2_to_listaDeRestaurantesFragment)
        }


        //montando a recycler view
        view.frag_lista_pratos_recyclerview.adapter = adapPratos
        view.frag_lista_pratos_recyclerview.layoutManager = GridLayoutManager(context, 2)
        view.frag_lista_pratos_recyclerview.setHasFixedSize(true)

        //pegando o restaurante escolhido que veio no bundle
        val restEscolhido = arguments?.get("chave") as Restaurante

        //passando os dados do restaurante escolhiod para o layout
        view.menu_restaurante_imagemRest.setImageResource(restEscolhido.imagem)
        view.menu_restaurante_nome.setText(restEscolhido.nome.toString())

        return view

    }

    override fun pratoClick(position: Int) {

        //pegando o prato clicado e fazendo o bundle para enviar para o fragment descrição do prato
        val pratoEscolhido = listaPratos[position]

        Toast.makeText(context, pratoEscolhido.nome, Toast.LENGTH_SHORT).show()

        val bundlePrato = bundleOf("chave" to pratoEscolhido)


        //setando o caminho e mandando o bundle
        findNavController().navigate(R.id.action_listaPratosFragment2_to_descricaoPrato, bundlePrato)

    }


}


fun getPratos(): MutableList<Prato> {
    return mutableListOf(
        Prato("Salada com molho Gengibre1", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre2", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre3", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre4", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre5", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre6", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre7", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre8", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre9", R.drawable.imgaoyama),
        Prato("Salada com molho Gengibre10", R.drawable.imgaoyama)
    )

}

