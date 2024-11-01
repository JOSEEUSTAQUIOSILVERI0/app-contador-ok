package com.br.eustaquio.app_contador_ok

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Variável que armazena o valor do contador
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referências para os componentes da interface
        val tvCounter: TextView = findViewById(R.id.tvCounter)
        val btnIncrease: Button = findViewById(R.id.btnIncrease)
        val btnDecrease: Button = findViewById(R.id.btnDecrease)

        // Inicialmente desativa o botão "Diminuir" pois o valor inicial é 0
        btnDecrease.isEnabled = false

        // Ação do botão "Aumentar"
        btnIncrease.setOnClickListener {
            // Incrementa o contador e atualiza a exibição
            counter++
            tvCounter.text = counter.toString()

            // Habilita o botão "Diminuir" se o valor do contador for maior que 0
            if (counter > 0) {
                btnDecrease.isEnabled = true
            }
        }

        // Ação do botão "Diminuir"
        btnDecrease.setOnClickListener {
            if (counter > 0) {
                // Decrementa o contador e atualiza a exibição
                counter--
                tvCounter.text = counter.toString()
            }

            // Desativa o botão "Diminuir" se o contador chegar a 0
            if (counter == 0) {
                btnDecrease.isEnabled = false
            }
        }
    }
}
