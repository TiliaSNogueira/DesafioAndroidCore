package com.e.digitalhousefoods.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.e.digitalhousefoods.R
import com.e.digitalhousefoods.modelo.Prato
import kotlinx.android.synthetic.main.fragment_descricao_prato.view.*

class DescricaoPrato : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_descricao_prato, container, false)

        //pegando o prato escolhido que veio no bundle
        val pratoEscolhido = recebePrato()

        exibePratoEscolhido(view, pratoEscolhido)

      //  voltaNavigationIcon(view)

        return view
    }


//    private fun voltaNavigationIcon(view: View) {
//        view.descricao_prato_fragment_toolbar.setNavigationOnClickListener {
//            findNavController().navigate(R.id.action_descricaoPrato_to_listaPratosFragment2)
//        }
//    }

    private fun exibePratoEscolhido(
        view: View,
        pratoEscolhido: Prato
    ) {
        view.frag_detalhe_prato_imagem.setImageResource(pratoEscolhido.imagem)
        view.frag_detalhes_prato_nome.setText(pratoEscolhido.nome)
    }

    private fun recebePrato(): Prato {
        val pratoEscolhido = arguments?.get("chave") as Prato
        return pratoEscolhido
    }
}