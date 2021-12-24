package com.example.practiceclass2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etNum1: EditText = findViewById(R.id.etNum1)
        var etNum2: EditText = findViewById(R.id.etNum2)
        var et1: TextView = findViewById(R.id.tv1)
        val btnAdd: Button = findViewById(R.id.btn1)
        val btnSub: Button = findViewById(R.id.btn2)

            //足し算ボタン
            btnAdd.setOnClickListener {
                var ad = Calc()//インスタンス化
                //引数etNumを渡してCalcクラスのadd関数を実行
                var result = ad.add(etNum1,etNum2)//実行した結果はresultへ代入
                et1.text = "合計は$result"
            }
            //引き算ボタン
            btnSub.setOnClickListener {
                //var su = Calc()//ではなく↓こんなふうにもかける
                var result = Calc().sub(etNum1,etNum2)
                et1.text = "合計は$result"
            }

    }
}