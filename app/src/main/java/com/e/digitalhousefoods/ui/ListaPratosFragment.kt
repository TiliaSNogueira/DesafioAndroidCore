package com.e.digitalhousefoods.ui

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

        Toast.makeText(context, pratoEscolhido.nome , Toast.LENGTH_SHORT).show()

        val bundlePrato = bundleOf("chave" to pratoEscolhido)


        //setando o caminho e mandando o bundle
        findNavController().navigate(
            R.id.action_listaPratosFragment2_to_descricaoPrato,
            bundlePrato
        )

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

