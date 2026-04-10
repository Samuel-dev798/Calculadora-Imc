package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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

        btnCalcular.setOnClickListener {

            val weightStr: String = edtweight.text.toString()
            val heightStr: String = edtheight.text.toString()

            //validação dos campos se não estão vazios
            if (weightStr == "" || heightStr == "") {
                //mostrar mensagem para usuario
                Snackbar.make(
                    edtweight,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                )
                    .show()

            } else {

                val weight = weightStr.toFloat()
                val height = heightStr.toFloat()

                // calculo imc
                val height2 = height * height
                val result = weight / height2
                println(result)

            }

        }
    }
}