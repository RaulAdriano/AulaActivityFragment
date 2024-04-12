package com.rauladrianoramos.aulaactivityfragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var buttonAbrir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida", "onCreate")
        setContentView(R.layout.activity_main)

        buttonAbrir = findViewById(R.id.button_abrir)
        buttonAbrir.setOnClickListener{

            val intent = Intent(this, DetalhesActivity::class.java)

            //passar parametros para nova tela
            intent.putExtra("serie", "The Witcher")
            intent.putExtra("classificacao", 5)
            intent.putExtra("avaliacao", 9.5)

            startActivity(intent)

        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "onStart")
        //carregar dados
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "onResume")


    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ciclo_vida", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo_vida", "onDestroy")
    }
}