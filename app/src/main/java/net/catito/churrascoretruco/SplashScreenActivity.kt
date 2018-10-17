package net.catito.churrascoretruco

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        GlideApp.with(this)
                .load("https://img.itdg.com.br/tdg/images/blog/uploads/2016/12/shutterstock_279094049.jpg")
                .placeholder(R.drawable.churrascao)
                .into(imgLogoApp)

        Handler().postDelayed({
            val listaChurraco = Intent(this, Futebol::class.java)
            startActivity(listaChurraco)
            finish()
        }, 2000)


    }
}
