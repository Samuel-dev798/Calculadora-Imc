package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULTADO_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val resultado = intent.getFloatExtra(KEY_RESULTADO_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)
        tvResult.text = resultado.toString()

        var classification: String = if (resultado <= 18.5f) {
            "Magreza"
        } else if (resultado > 18.5f && resultado <= 24.9f) {
            "Normal"
        } else if (resultado > 25f && resultado <= 29.9f) {
            "Sobrepeso I"
        } else if (resultado > 30.0f && resultado <= 39.9f) {
            "Obedidade II"
        } else {
            "Obesidade grave"
        }

        tvClassificacao.text = classification


    }
}