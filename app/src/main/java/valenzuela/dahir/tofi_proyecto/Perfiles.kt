package valenzuela.dahir.tofi_proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Perfiles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfiles)

        val btn_img1: ImageButton = findViewById(R.id.cuenta1)
        val btn_img2: ImageButton = findViewById(R.id.cuenta2)
        val btn_img3: ImageButton = findViewById(R.id.cuenta3)

        btn_img1.setOnClickListener{
            var intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}