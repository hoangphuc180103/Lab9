package com.example.lab9

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnOptionMenu).setOnClickListener {
            startActivity(Intent(this, OptionMenuActivity::class.java))
        }

        findViewById<Button>(R.id.btnContextMenu).setOnClickListener {
            startActivity(Intent(this, ContextMenuActivity::class.java))
        }

        findViewById<Button>(R.id.btnContextualAction).setOnClickListener {
            startActivity(Intent(this, ContextualActionBarActivity::class.java))
        }

        findViewById<Button>(R.id.btnPopupMenu).setOnClickListener {
            startActivity(Intent(this, PopupMenuActivity::class.java))
        }
    }
}

