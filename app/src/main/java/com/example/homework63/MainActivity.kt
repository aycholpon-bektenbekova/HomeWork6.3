package com.example.homework63

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.homework63.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var hashtags = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
           btnClick.setOnClickListener {
               if (etMessage.text.isNotEmpty() && etMessage.equals("#")){
                   hashtags.add(etMessage.text.toString())
               }
           }
            etMessage.text.clear()
            if (etMessage.text.isNotEmpty()){
                tvHashtags.isVisible = true
                tvHashtags.text = hashtags.toString()
            }
        }
    }
}