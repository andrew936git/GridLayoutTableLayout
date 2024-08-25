package com.example.gridlayouttablelayout

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.gridlayouttablelayout.R.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val list = mutableListOf<String>()
    private val calculator = Calculator()

    private lateinit var toolbarTB: Toolbar

    private lateinit var editText: EditText
    private lateinit var textViewResult: TextView

    private lateinit var oneBT: Button
    private lateinit var twoBT: Button
    private lateinit var threeBT: Button
    private lateinit var fourBT: Button
    private lateinit var fiveBT: Button
    private lateinit var sixBT: Button
    private lateinit var sevenBT: Button
    private lateinit var eightBT: Button
    private lateinit var nineBT: Button
    private lateinit var zeroBT: Button
    private lateinit var divisionBT: Button
    private lateinit var multipleBT: Button
    private lateinit var plusBT: Button
    private lateinit var minusBT: Button
    private lateinit var equalsBT: Button
    private lateinit var resetBT: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_main)
        init()


    }

    private fun init(){
        toolbarTB = findViewById(id.toolbarTB)
        setSupportActionBar(toolbarTB)
        title = "Калькулятор"

        editText = findViewById(id.editText)
        editText.isEnabled = false
        textViewResult = findViewById(id.textViewResult)

        oneBT = findViewById(id.oneBT)
        oneBT.setOnClickListener(this)
        twoBT = findViewById(id.twoBT)
        twoBT.setOnClickListener(this)
        threeBT = findViewById(id.threeBT)
        threeBT.setOnClickListener(this)
        fourBT = findViewById(id.fourBT)
        fourBT.setOnClickListener(this)
        fiveBT = findViewById(id.fiveBT)
        fiveBT.setOnClickListener(this)
        sixBT = findViewById(id.sixBT)
        sixBT.setOnClickListener(this)
        sevenBT = findViewById(id.sevenBT)
        sevenBT.setOnClickListener(this)
        eightBT = findViewById(id.eightBT)
        eightBT.setOnClickListener(this)
        nineBT = findViewById(id.nineBT)
        nineBT.setOnClickListener(this)
        zeroBT = findViewById(id.zeroBT)
        zeroBT.setOnClickListener(this)
        divisionBT = findViewById(id.divisionBT)
        divisionBT.setOnClickListener(this)
        multipleBT = findViewById(id.multipleBT)
        multipleBT.setOnClickListener(this)
        plusBT = findViewById(id.plusBT)
        plusBT.setOnClickListener(this)
        minusBT = findViewById(id.minusBT)
        minusBT.setOnClickListener(this)
        equalsBT = findViewById(id.equalsBT)
        equalsBT.setOnClickListener(this)
        resetBT = findViewById(id.resetBT)
        resetBT.setOnClickListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            id.exit_menu -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View){
        var result = ""
        when(v.id){
            id.oneBT -> {
                list.add("1")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.twoBT -> {
                list.add("2")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.threeBT -> {
                list.add("3")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.fourBT -> {
                list.add("4")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.fiveBT -> {
                list.add("5")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.sixBT -> {
                list.add("6")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.sevenBT -> {
                list.add("7")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.eightBT -> {
                list.add("8")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.nineBT -> {
                list.add("9")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.zeroBT -> {
                list.add("0")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.resetBT -> {
                list.clear()
                editText.text.clear()
                textViewResult.text = "Результат"
            }
            id.plusBT -> {
                list.add("+")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.minusBT -> {
                list.add("-")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.divisionBT -> {
                list.add("/")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.multipleBT -> {
                list.add("*")
                list.forEach{result += it}
                editText.setText(result)
            }
            id.equalsBT -> {
                list.add("=")
                list.forEach{result += it}
                editText.setText(result)
                textViewResult.text =  calculator.calculation(result)
                list.clear()
            }

        }
    }
}

