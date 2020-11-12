package com.e.digitalhousefoods.ui

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.e.digitalhousefoods.R
import kotlinx.android.synthetic.main.fragment_register.*
import kotlinx.android.synthetic.main.fragment_register.view.*


class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register, container, false)

        //colocando evento de click na setinha de voltar
        voltaNavigationIcon(view)

        mudaCorCamposPreenchimento(view)

        mudaCorButton(view)

        //clique no botao register abre lista de restaurantes
        clickButonRegister(view)

        return view
    }



    private fun clickButonRegister(view: View) {
        view.frag_register_register.setOnClickListener() {
            findNavController().navigate(R.id.action_registerFragment_to_listaDeRestaurantesFragment)
        }
    }

    private fun mudaCorButton(view: View) {
        view.frag_register_register.setBackgroundColor(Color.RED)
    }

    private fun mudaCorCamposPreenchimento(view: View) {
        view.frag_register_name.setBackgroundColor(Color.WHITE)
        view.frag_register_email.setBackgroundColor(Color.WHITE)
        view.frag_register_password.setBackgroundColor(Color.WHITE)
        view.frag_register_repeatPassword.setBackgroundColor(Color.WHITE)
    }

    private fun voltaNavigationIcon(view: View) {
        view.registerFragment_toolbar.setNavigationOnClickListener {
            //mapa que faz voltar para o fragment login
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
    }

}