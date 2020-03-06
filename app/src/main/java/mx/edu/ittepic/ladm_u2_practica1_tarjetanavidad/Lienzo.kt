package mx.edu.ittepic.ladm_u2_practica1_tarjetanavidad

import android.graphics.*
import android.view.View

class Lienzo(p: MainActivity) : View(p){
    var puntero = p
    var punteroFiguraGeometrica: FiguraGeometrica? = null
    var coposNieve : Array<FiguraGeometrica> = Array(50, { FiguraGeometrica(0, 1600, 15) })


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()


        //dibujando el cielo
        paint.style= Paint.Style.FILL
        paint.color= Color.rgb(   59, 51, 138 )
        canvas.drawRect(0f, 0f,5000f,5000f, paint)

        //dibujando la nieve del piso
        paint.style= Paint.Style.FILL
        paint.color= Color.rgb( 255, 255, 255 )
        canvas.drawRect(0f, 1000f,2000f,2000f, paint)

        //pintando la casa
        paint.style= Paint.Style.FILL
        paint.color= Color.rgb(    161, 17, 65  )
        canvas.drawRect(500f, 800f,1000f,1200f, paint)

        //dibujando las ventanas
        paint.style= Paint.Style.FILL
        paint.color= Color.rgb(     237, 240, 57   )
        canvas.drawRect(600f, 900f,700f,1000f, paint)

        paint.style= Paint.Style.FILL
        paint.color= Color.rgb(     237, 240, 57   )
        canvas.drawRect(800f, 900f,900f,1000f, paint)

        //dibujando la puerta

        paint.style= Paint.Style.FILL
        paint.color= Color.rgb(      136, 70, 12   )
        canvas.drawRect(700f, 1050f,800f,1200f, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        canvas.drawRect(700f, 1050f,800f,1200f, paint)

        //Dibujando la luna
        paint.style= Paint.Style.FILL
        paint.color= Color.rgb(     255,255,255  )
        canvas.drawCircle(200f, 200f, 100f, paint)

        //Dibujando la luna
        paint.style= Paint.Style.FILL
        paint.color= Color.rgb(     59, 51, 138)
        canvas.drawCircle(300f, 200f, 100f, paint)

        //Dibujando estrellas
        paint.style= Paint.Style.FILL
        paint.color= Color.rgb(255,255,255)
        canvas.drawCircle(400f, 200f, 5f, paint)
        paint.style= Paint.Style.FILL
        paint.color= Color.rgb(255,255,255)
        canvas.drawCircle(600f, 280f, 5f, paint)
        paint.style= Paint.Style.FILL
        paint.color= Color.rgb(255,255,255)
        canvas.drawCircle(1000f, 100f, 5f, paint)

        //dibujando árbol
        paint.style= Paint.Style.FILL
        paint.color= Color.rgb( 14, 82, 26 )
        canvas.drawCircle(300f, 900f, 100f, paint)

        paint.style= Paint.Style.FILL
        paint.color= Color.rgb(      136, 70, 12   )
        canvas.drawRect(260f, 1100f, 320f,1300f, paint)

        paint.style= Paint.Style.FILL
        paint.color= Color.rgb( 14, 82, 26 )
        canvas.drawCircle(300f, 1000f, 120f, paint)

        var path = Path()
        path.moveTo(500f, 800f)
        path.lineTo(1000f, 800f)
        path.lineTo(750f, 500f)
        paint.style= Paint.Style.FILL
        paint.setColor(Color.parseColor("#754812"  ))
        canvas.drawPath(path, paint)


        paint.color = Color.WHITE
        paint.style = Paint.Style.FILL
        (0..49).forEach {
            coposNieve[it].pintar(canvas,paint)
        }

    }

    fun animarCirculo() {
        (0..49).forEach {
            coposNieve[it].animar()
        }
        invalidate()
    }
}