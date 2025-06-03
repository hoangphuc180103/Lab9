package com.example.lab9

import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ContextMenuActivity : AppCompatActivity() {
    private lateinit var btnShow: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu)

        btnShow = findViewById(R.id.btnShow)
        registerForContextMenu(btnShow)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.setHeaderTitle("Context Menu")
        menu?.add(0, 1, 0, "Upload")
        menu?.add(0, 2, 0, "Search")
        menu?.add(0, 3, 0, "Share")
        menu?.add(0, 4, 0, "Bookmark")
    }


    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            1 -> {
                Toast.makeText(this, "Upload selected", Toast.LENGTH_SHORT).show()
                true
            }
            2 -> {
                Toast.makeText(this, "Search selected", Toast.LENGTH_SHORT).show()
                true
            }
            3 -> {
                Toast.makeText(this, "Share selected", Toast.LENGTH_SHORT).show()
                true
            }
            4 -> {
                Toast.makeText(this, "Bookmark selected", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }

}
