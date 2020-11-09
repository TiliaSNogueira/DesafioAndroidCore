package com.e.digitalhousefoods.ui

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.e.digitalhousefoods.R
import kotlinx.android.synthetic.main.fragment_login.view.*
import kotlinx.android.synthetic.main.fragment_register.view.*


class RegisterFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val  view =inflater.inflate(R.layout.fragment_register, container, false)

        //mudando cor dos campos
        view.frag_register_name.setBackgroundColor(Color.WHITE)
        view.frag_register_email.setBackgroundColor(Color.WHITE)
        view.frag_register_password.setBackgroundColor(Color.WHITE)
        view.frag_register_repeatPassword.setBackgroundColor(Color.WHITE)


        //mudando cor do button
        view.frag_register_register.setBackgroundColor(Color.RED)

        view.frag_register_register.setOnClickListener(){
            findNavController().navigate(R.id.action_registerFragment_to_listagemDeRestaurantes)
        }

        return view
    }


}