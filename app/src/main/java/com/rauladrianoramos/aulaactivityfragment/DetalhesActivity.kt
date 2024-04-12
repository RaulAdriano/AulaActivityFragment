package com.rauladrianoramos.aulaactivityfragment

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesActivity : AppCompatActivity() {

    lateinit var buttonFechar: Button
    lateinit var textSerie: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        buttonFechar = findViewById(R.id.button_fechar)
        textSerie = findViewById(R.id.text_serie)

        val bundle = intent.extras //todos os parametros passados
        if (bundle != null) {
            val serie = bundle.getString("serie")
            val classificacao = bundle.getInt("classificacao")
            val avaliacao = bundle.getDouble("avaliacao")

            val resultado = "Serie: $serie - classificacao: $classificacao - avaliacao: $avaliacao "
            textSerie.text = resultado
        }

        buttonFechar.setOnClickListener {
            finish()
        }
    }
}