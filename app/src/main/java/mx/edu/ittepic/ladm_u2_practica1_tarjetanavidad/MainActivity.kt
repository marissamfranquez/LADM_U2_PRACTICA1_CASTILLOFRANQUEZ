package mx.edu.ittepic.ladm_u2_practica1_tarjetanavidad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var lienzo : Lienzo ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(Lienzo(this))
        lienzo = Lienzo(this)
        setContentView(lienzo!!)

        HiloAnimacion(this).start()
    }
}
