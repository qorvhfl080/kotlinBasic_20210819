package com.neppplus.kotlinbasic_20210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logBtn01.setOnClickListener {

            Log.d("메인화면", "Log.debug")
            Log.e("메인화면", "Log.error")
            Log.i("메인화면", "Log.info")

        }

        logBtn02.setOnClickListener {

            Log.d("메인화면", "두 번째 로그 버튼 눌림")

        }

    }
}