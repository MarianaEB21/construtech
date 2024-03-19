package br.com.fiap.construtech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMateriais: Button = findViewById<Button>(R.id.btn_materiais)

        btnMateriais.setOnClickListener {
            goToBuscaDeMateriais()
        }
    }

    private fun goToBuscaDeMateriais() {
        val intent = Intent(this, MateriaisActivity::class.java)
        startActivity(intent)
    }
}