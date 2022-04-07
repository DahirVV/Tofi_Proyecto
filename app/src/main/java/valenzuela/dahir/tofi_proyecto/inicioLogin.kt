package valenzuela.dahir.tofi_proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class inicioLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_login)
        val button:Button = findViewById(R.id.btniniciarsesion)

        button.setOnClickListener{
            var intent: Intent = Intent(this, Perfiles::class.java)
            startActivity(intent)
        }
    }
}