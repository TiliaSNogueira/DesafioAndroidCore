package com.e.digitalhousefoods.ui

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.e.digitalhousefoods.R
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        //mudando cores dos buttons
        view.frag_login_btnlogin.setBackgroundColor(Color.RED)
        view.frag_login_btnregister.setBackgroundColor(Color.GRAY)

        //mudando cor dos campos
        view.frag_login_email.setBackgroundColor(Color.WHITE)
        view.frag_login_password.setBackgroundColor(Color.WHITE)


        view.frag_login_btnregister.setOnClickListener(){
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)

        }

        view.frag_login_btnlogin.setOnClickListener(){
            findNavController().navigate(R.id.action_loginFragment_to_listagemDeRestaurantes)
        }


        return view

    }


}
