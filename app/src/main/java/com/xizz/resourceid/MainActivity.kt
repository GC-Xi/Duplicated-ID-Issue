package com.xizz.resourceid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xizz.library.LibActivity
import kotlinx.android.synthetic.main.activity_main.launch_button

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        launch_button.setOnClickListener {
            startActivity(Intent(this, LibActivity::class.java))
        }
    }
}