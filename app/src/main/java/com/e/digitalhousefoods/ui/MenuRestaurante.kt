package com.e.digitalhousefoods.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.e.digitalhousefoods.MenuRestauranteAdapter
import com.e.digitalhousefoods.Prato
import com.e.digitalhousefoods.R
import com.e.digitalhousefoods.Restaurante
import kotlinx.android.synthetic.main.fragment_lista_pratos.*

class MenuRestaurante : AppCompatActivity() {

//    //lista estática dos pratos
//    val listaPratos: MutableList<Prato> = getPratos()
//
//    //adapter
//    val adapPratos = MenuRestauranteAdapter(listaPratos, this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_restaurante)

//        //montando a recycler view
//        frag_lista_pratos_recyclerview.adapter = adapPratos
//        frag_lista_pratos_recyclerview.layoutManager = GridLayoutManager(this, 2)
//        frag_lista_pratos_recyclerview.setHasFixedSize(true)
//
//
//    }
//
//    override fun pratoClick(position: Int) {
//        Toast.makeText(this, "Prato clicado", Toast.LENGTH_SHORT).show()
//    }

//    fun getPratos(): MutableList<Prato> {
//        return mutableListOf(
//            Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
//            Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
//            Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
//            Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
//            Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
//            Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
//            Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
//            Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
//            Prato("Salada com molho Gengibre", R.drawable.imgaoyama),
//            Prato("Salada com molho Gengibre", R.drawable.imgaoyama)
//        )
//
    }
}