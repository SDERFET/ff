package com.karma.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        seekBar.setProgress(10)
        seekBar.incrementProgressBy(15)
        seekBar.setMax(75)
        seekBar.getProgress()
        seekBar.getMax()



    }
}


