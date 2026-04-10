package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1 . recuperar os componentes EditText
        //2. Criar uma variavel e associar o componente de UI<EditText>
        //3. recuperar o botão da tela

        val edtweight = findViewById<TextInputEditText>(R.id.edt_weight)
        val edtheight = findViewById<TextInputEditText>(R.id.edt_height)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener{
            val peso = edtweight.text
            val altura = edtheight.text

            println(peso)
        }

    }
}