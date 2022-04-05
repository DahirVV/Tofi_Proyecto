package valenzuela.dahir.tofi_proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import valenzuela.dahir.tofi_proyecto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigationView = binding.BottomNav
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.FragmentContainer) as NavHostFragment
        val appBarConfiguration = AppBarConfiguration(
            setOf(R.id.inicioFragment, R.id.buscarFragment, R.id.bibliotecaFragment, R.id.actividadesFragment, R.id.perfilFragment)
        )
        val navController = navHostFragment.navController

        setupActionBarWithNavController(navController,appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)

    }
}