package com.example.taller1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnenviar: Button = findViewById(R.id.btnenviar)
        btnenviar.setOnClickListener { ejecutarAccion() }
    }

    private fun ejecutarAccion(){
        val campoTexto = findViewById<EditText>(R.id.nombretxt)
        val grupoRadio = findViewById<RadioGroup>(R.id.radioGroup)
        val radioButton = grupoRadio.checkedRadioButtonId
        val radioButton2 = findViewById<RadioButton>(radioButton)
        val switchButton = findViewById<Switch>(R.id.switch1)
        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)
        var nombre = campoTexto.text.toString()
        var ToggleCheked = toggleButton.isChecked
        var radiotxt = radioButton2.text.toString()
        var switchCheked = switchButton.isChecked

        Toast.makeText(this, "$nombre $radiotxt $ToggleCheked $switchCheked", Toast.LENGTH_SHORT).show()
    }
}
