package com.example.lab9

import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu

class PopupMenuActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_menu)

        val btnShow = findViewById<Button>(R.id.btnShow)
        btnShow.setOnClickListener {
            val popup = PopupMenu(this, it)
            popup.setOnMenuItemClickListener(this)
            popup.inflate(R.menu.popup_menu)
            popup.show()
        }
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        Toast.makeText(this, "Selected: ${item?.title}", Toast.LENGTH_SHORT).show()
        return true
    }
}
