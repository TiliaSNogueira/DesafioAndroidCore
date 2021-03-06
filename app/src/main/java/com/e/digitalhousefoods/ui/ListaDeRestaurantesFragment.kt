package com.e.digitalhousefoods.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.digitalhousefoods.R
import com.e.digitalhousefoods.adapter.ListRestaurantesAdapter
import com.e.digitalhousefoods.domain.Restaurante
import kotlinx.android.synthetic.main.fragment_lista_de_restaurantes.view.*

class ListaDeRestaurantesFragment : Fragment(), ListRestaurantesAdapter.OnRestauranteClickListener {

    //lista estática dos restaurantes
    var listaRestaurantes: MutableList<Restaurante> = getRestaurantes()

    //o adapter é a própria classe adapter que fiz
    var adapRest = ListRestaurantesAdapter(listaRestaurantes, this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lista_de_restaurantes, container, false)

        //configurando o adapter
        configuraAdapter(view)

        return view

    }

    //quando clicar em um item da lista, vai abrir a tela de pratos do restaurante escolhido
    override fun restauranteClick(position: Int) {
        val restEscolhido = listaRestaurantes[position]

        //colocando o restaurante escolhido no bundle
        val bundleRestEscolhido = bundleOf("chave" to restEscolhido)

        //enviando o mapa e o bundle
        findNavController().navigate(
            R.id.action_listaDeRestaurantesFragment_to_listaPratosFragment2,
            bundleRestEscolhido
        )

        Toast.makeText(context, restEscolhido.nome, Toast.LENGTH_SHORT).show()
    }


    private fun configuraAdapter(view: View) {
        view.fragmentListaDeRestaurantes_recyclerview.adapter = adapRest
        view.fragmentListaDeRestaurantes_recyclerview.layoutManager = LinearLayoutManager(context)
        view.fragmentListaDeRestaurantes_recyclerview.setHasFixedSize(true)
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
}


