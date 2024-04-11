package com.rauladrianoramos.aulaactivityfragment

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetalhesActivity : AppCompatActivity() {

    lateinit var buttonFechar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        buttonFechar = findViewById(R.id.button_fechar)
        buttonFechar.setOnClickListener {
            finish()
        }
    }
}