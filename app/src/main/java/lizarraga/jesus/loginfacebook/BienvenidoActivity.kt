package lizarraga.jesus.loginfacebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BienvenidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)


        var tv_nombre = findViewById(R.id.te) as TextView
        var bundle = intent.extras
        if (bundle != null){
              var nombre = bundle.getString("nombre")
            var apellido= bundle.getString("apellido")
            tv_nombre.setText("$nombre $apellido")
        }
    }
}