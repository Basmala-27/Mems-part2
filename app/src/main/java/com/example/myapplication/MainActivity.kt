
package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity  : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linkedin = findViewById<Button>(R.id.linkedin)
        val linkedin1 = findViewById<ImageButton>(R.id.imageButton14)
        linkedin.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/basmala-mohamed-9b9a42333"))
            startActivity(intent)
        }
        linkedin1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/basmala-mohamed-9b9a42333"))
            startActivity(intent)

        }
    }
}

