package com.e.digitalhousefoods.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.digitalhousefoods.ListRestaurantesAdapter
import com.e.digitalhousefoods.R
import com.e.digitalhousefoods.Restaurante
import kotlinx.android.synthetic.main.activity_listagem_de_restaurantes.*
import kotlinx.android.synthetic.main.activity_main.*

class ListagemDeRestaurantes : AppCompatActivity(),
    ListRestaurantesAdapter.OnRestauranteClickListener {

    //lista estática dos restaurantes
    var listaRestaurantes: MutableList<Restaurante> = getRestaurantes()

    //o adapter é a própria classe adapter que fiz
    var adapRest = ListRestaurantesAdapter(listaRestaurantes, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listagem_de_restaurantes)

        //setando toolbar
        setSupportActionBar(listagem_rest_toolbar)

        //configurando o adapter
        listaRestaurantes_recyclerview.adapter = adapRest
        listaRestaurantes_recyclerview.layoutManager = LinearLayoutManager(this)
        listaRestaurantes_recyclerview.setHasFixedSize(true)

    }


    fun getRestaurantes(): MutableList<Restaurante> {
        return mutableListOf(
            Restaurante(
                "Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "22:00", R.drawable.imgtony
            ),
            Restaurante(
                "Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema",
                "00:00", R.drawable.imgaoyama
            ),
            Restaurante(
                "Outback - Moema", "Av. Moaci, 187 - Moema, São Paulo",
                "00:00", R.drawable.imgoutback
            ),
            Restaurante(
                "Sí Señor!", "Alameda Jauaperi, 626 - Moema",
                "01:00", R.drawable.imgsisenor
            )
        )
    }

    override fun restauranteClick(position: Int) {
        //vai abrir o menu deste restaurante clicado
        Toast.makeText(this, "Restaurante clicado", Toast.LENGTH_SHORT).show()
        val intentVaiParaRestaurante = Intent(this, MenuRestaurante::class.java)
        startActivity(intentVaiParaRestaurante)
    }

}