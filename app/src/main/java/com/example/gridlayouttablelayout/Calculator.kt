package com.example.gridlayouttablelayout

import androidx.core.text.isDigitsOnly

class Calculator {
    fun calculation(text: String):String{
        val list = text.split('-','+','*','/','=')
        val num1 = list[0].toDouble()
        val num2 = list[1].toDouble()
        var symbol = '='
        var result = 0.0
        if (text.toCharArray().contains('+')) symbol = '+'
        else if (text.toCharArray().contains('-')) symbol = '-'
        else if (text.toCharArray().contains('*')) symbol = '*'
        else symbol = '/'

        when(symbol){
            '+' -> result = num1 + num2
            '-' -> result = num1 - num2
            '*' -> result = num1 * num2
            '/' -> result = num1 / num2
        }
        return result.toString()
    }
}