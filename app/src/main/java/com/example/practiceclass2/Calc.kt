package com.example.practiceclass2

import android.widget.EditText

//1つのファイルにクラスは1つだけ！！
class Calc {

    fun add(etNum1: EditText,etNum2: EditText): Int {
        var plus: Int = etNum1.text.toString().toInt() + etNum2.text.toString().toInt()
        return plus
    }

    fun sub(etNum1: EditText, etNum2: EditText): Int {
        //↓こんなふうにも書ける
        return etNum1.text.toString().toInt() - etNum2.text.toString().toInt()
    }

}