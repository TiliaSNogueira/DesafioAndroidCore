package com.e.digitalhousefoods.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.e.digitalhousefoods.R
import com.e.digitalhousefoods.modelo.Restaurante
import kotlinx.android.synthetic.main.activity_listagem_de_restaurantes.*

class MenuRestaurante : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_restaurante)

        //pegando extra da intent que veio da listagem de restaurante
        var restauranteEscolhido = intent.getSerializableExtra("key") as? Restaurante


//        setSupportActionBar(listagem_rest_toolbar)
//
//        navController = findNavController(R.id.nav_host_fragment_menuRestaurante)
//
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//
//        setupActionBarWithNavController(navController, appBarConfiguration)


    }

//    override fun onSupportNavigateUp(): Boolean {
//        return navController.navigateUp(appBarConfiguration) ||
//                super.onSupportNavigateUp()
//    }


}