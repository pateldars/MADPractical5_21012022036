package com.example.madpractical5_21012022059

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onplay(){
        Intent(this,MyService::class.java).putExtra(MyService.DATA_KEY,MyService.DATA_VALUE).apply { startService(this) }
    }
    fun onstop(){
        Intent(this,MyService::class.java).apply { stopService(this)}
    }
}