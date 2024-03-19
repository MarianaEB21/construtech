package br.com.fiap.construtech

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MateriaisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_materiais)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnVoltar: Button = findViewById<Button>(R.id.btn_voltar)

        btnVoltar.setOnClickListener {
            voltarTela()
        }

        val cardMadeira: CardView = findViewById<CardView>(R.id.card_madeira)

        cardMadeira.setOnClickListener {
            voltarTela()
        }
    }

    private fun voltarTela() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}