package com.e.digitalhousefoods.domain

import java.io.Serializable

class Restaurante(val nome: String, val endereco: String, val horario: String, val imagem: Int) : Serializable{
    override fun toString(): String {
        return "Restaurante(nome='$nome', endereco='$endereco', horario='$horario')"
    }
}