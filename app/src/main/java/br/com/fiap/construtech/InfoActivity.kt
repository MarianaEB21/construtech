package br.com.fiap.construtech

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.widget.TextView


class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val btnVoltarInfo: Button = findViewById<Button>(R.id.btn_voltar_info)

        btnVoltarInfo.setOnClickListener {
            voltarTela()

        }

    }

    private fun voltarTela() {
        val intent = Intent(this, MateriaisActivity::class.java)
        startActivity(intent)
    }
}


//// Criando a classe madeira
//// class Madeira(
////     val name: String,
////     val description: String) {
//// }
//
//// Criando um produto e a descrição
//val madeira = Madeira(
//    name = "Madeira",
//    description = "Utilização na Construção:\n" +
//            "Amplamente usada em várias estruturas, desde residenciais até comerciais e industriais.\n" +
//            "Presente em projetos de infraestrutura, como pontes e estradas.\n" +
//            "\n" +
//            "Propriedades Construtivas:\n" +
//            "Versatilidade, leveza e resistência.\n" +
//            "Boa relação resistência-peso, permitindo estruturas eficientes.\n" +
//            "Facilidade de trabalhar, permitindo construção rápida e flexível.\n" +
//            "\n" +
//            "Resistência ao Fogo:\n" +
//            "Varia de acordo com o tipo de madeira e tratamento.\n" +
//            "Madeiras densas e resinosas têm maior resistência.\n" +
//            "Tratamentos com retardantes de fogo podem aumentar a resistência.\n" +
//            "Mesmo com tratamentos, não é incombustível e pode queimar em temperaturas elevadas.\n" +
//            "\n" +
//            "Técnicas para Melhorar a Resistência ao Fogo:\n" +
//            "Aplicação de revestimentos intumescentes.\n" +
//            "Detalhes construtivos que reduzem a propagação do fogo.\n" +
//            "Uso de madeira laminada colada ou peças de madeira maciça com seções transversais maiores.\n" +
//            "\n" +
//            "Regulamentação e Normas de Segurança:\n" +
//            "Normas técnicas específicas, como a NBR 7190.\n" +
//            "Abordam classificação de madeiras, tratamentos preservativos, dimensionamento estrutural e segurança contra incêndios."
//)
//
//// Exibindo os detalhes do produto
//val madeiraTextView: TextView = findViewById(R.id.madeiraTextView)
//val madeiradescriptionTextView: TextView = findViewById(R.id.madeiradescriptionTextView)
//
//madeiraTextView.text = "Produto: ${madeira.name}"
//madeiradescriptionTextView.text = "Descrição: ${madeira.description}"
//}