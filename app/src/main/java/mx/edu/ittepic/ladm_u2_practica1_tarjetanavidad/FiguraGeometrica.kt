package mx.edu.ittepic.ladm_u2_practica1_tarjetanavidad

import android.graphics.Canvas
import android.graphics.Paint

class FiguraGeometrica (){
    var x = 0f
    var y = 0f
    var tipo = 1
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incY = 5

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
    }


    fun pintar(c: Canvas, p: Paint){
        when(tipo){
            1->{
                c.drawCircle(x,y,radio,p)
            }
            2->{
                c.drawRect(x,y,x+ancho,y+alto,p)
            }
        }
    }



    fun animar(){
        y += incY
        if(y >= 1800){
            x = (50..1080).random().toFloat()
            y = (0..1920).random().toFloat() * -1
        }

    }


}