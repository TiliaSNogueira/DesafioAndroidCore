package com.e.digitalhousefoods.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.e.digitalhousefoods.R
import com.e.digitalhousefoods.modelo.Prato
import kotlinx.android.synthetic.main.fragment_descricao_prato.view.*

class DescricaoPrato : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_descricao_prato, container, false)


        //pegando o prato escolhido que veio no bundle
        val pratoEscolhido = arguments?.get("chave") as Prato

        //colocando os dados do prato escolhido na imagem e nome do prato exibido
        view.frag_detalhe_prato_imagem.setImageResource(pratoEscolhido.imagem)
        view.frag_detalhes_prato_nome.setText(pratoEscolhido.nome)


        //evento que faz voltar para a lista de pratos
        view.descricao_prato_fragment_toolbar.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_descricaoPrato_to_listaPratosFragment2)
        }

        return view
    }
}