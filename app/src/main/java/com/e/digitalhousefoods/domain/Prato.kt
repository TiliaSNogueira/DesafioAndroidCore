package com.e.digitalhousefoods.domain

import java.io.Serializable

class Prato(val nome : String, val imagem: Int) : Serializable{
    override fun toString(): String {
        return "Prato(nome='$nome', imagem=$imagem)"
    }
}