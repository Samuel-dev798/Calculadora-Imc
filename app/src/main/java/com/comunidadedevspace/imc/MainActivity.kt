package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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


                // Cria uma intenção (Intent) para abrir a tela ResultActivity
               // e em seguida inicia essa nova Activity
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULTADO_IMC,result)
                startActivity(intent)

                println(result)

            }

        }
    }
}