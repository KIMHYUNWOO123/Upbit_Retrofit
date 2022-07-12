package com.example.upbit_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.upbit_retrofit.Retrofit.RetrofitManage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var data = RetrofitManage.manager.getFund("CRIX.UPBIT.KRW-BTC")
            textView.text = data
        }
    }
}