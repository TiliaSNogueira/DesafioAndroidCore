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
        val view = inflater.inflate(R.layout.fragment_lista_pratos, container, false)

        //montando a recycler view
        configuraAdapter(view)

        //pegando o restaurante escolhido que veio no bundle
        val restEscolhido = recebeRestauranteEscolhido()


        exibeRestauranteEscolhido(view, restEscolhido)

        //colocando evento de click no navigationIcon
        voltaNavigationIcon(view)

        return view
    }

    override fun pratoClick(position: Int) {
        //pegando o prato clicado
        val pratoEscolhido = listaPratos[position]

        Toast.makeText(context, pratoEscolhido.nome, Toast.LENGTH_SHORT).show()

        // fazendo o bundle para enviar o prato ecolhido para o fragment descrição do prato
        val bundlePrato = bundleOf("chave" to pratoEscolhido)

        //setando o caminho e mandando o bundle
        findNavController().navigate(R.id.action_listaPratosFragment2_to_descricaoPrato, bundlePrato)

    }

    private fun exibeRestauranteEscolhido(
        view: View,
        restEscolhido: Restaurante
    ) {
        view.menu_restaurante_imagemRest.setImageResource(restEscolhido.imagem)
        view.menu_restaurante_nome.setText(restEscolhido.nome.toString())
    }

    private fun recebeRestauranteEscolhido(): Restaurante {
        val restEscolhido = arguments?.get("chave") as Restaurante
        return restEscolhido
    }

    private fun configuraAdapter(view: View) {
        view.frag_lista_pratos_recyclerview.adapter = adapPratos
        view.frag_lista_pratos_recyclerview.layoutManager = GridLayoutManager(context, 2)
        view.frag_lista_pratos_recyclerview.setHasFixedSize(true)
    }

    private fun voltaNavigationIcon(view: View) {
        view.lista_pratos_fragment_toolbar.setNavigationOnClickListener {
            //mapa que volta pra lista de restaurantes
            findNavController().navigate(R.id.action_listaPratosFragment2_to_listaDeRestaurantesFragment)
        }
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

