package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var btn:Button
    private lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel= ViewModelProvider(this, MainViewModelFactory(10))[MainViewModel::class.java]
        btn=findViewById(R.id.btn)
        tv=findViewById(R.id.tv)
        setText()
        btn.setOnClickListener {
            mainViewModel.increment()
            setText()
        }
    }

    private fun setText() {
        tv.text=mainViewModel.count.toString()
    }
}