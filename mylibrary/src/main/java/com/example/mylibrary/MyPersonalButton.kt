package com.example.mylibrary

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast

class MyPersonalButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
): LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context).inflate(R.layout.personal_button, this, true)
        val btn = findViewById<ImageButton>(R.id.btn_personal)
        btn.setOnClickListener { Toast.makeText(context, "This is my first library", Toast.LENGTH_SHORT).show() }
    }
}