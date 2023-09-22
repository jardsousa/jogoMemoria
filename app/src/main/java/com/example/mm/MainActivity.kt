package com.example.mm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tentativas: TextView
    private lateinit var reiniciar_botão: Button
    private lateinit var tempo: ProgressBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tentativas.findViewById(R.id.tentativas)
        reiniciar_botão.findViewById(R.id.reiniciar_botao)
        tempo.findViewById(R.id.tempo)


    }
}