package com.e.digitalhousefoods

class Restaurante(val nome: String, val endereco: String, val horario: String, val imagem: Int) {
    override fun toString(): String {
        return "Restaurante(nome='$nome', endereco='$endereco', horario='$horario')"
    }
}