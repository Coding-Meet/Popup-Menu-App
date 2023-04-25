package com.example.popupmenuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val popupImgBtn = findViewById<ImageButton>(R.id.popupImgBtn)

        popupImgBtn.setOnClickListener {
            val popup = PopupMenu(this@MainActivity, it)
            popup.setOnMenuItemClickListener(this@MainActivity)
            val inflater = popup.menuInflater
            inflater.inflate(R.menu.option_menu, popup.menu)
            popup.show()
        }
    }

    override fun onMenuItemClick(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about -> {
                Toast.makeText(this, "About Clicked", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.setting -> {
                Toast.makeText(this, "setting Clicked", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.contact -> {
                Toast.makeText(this, "contact Clicked", Toast.LENGTH_LONG).show()
                return true
            }

            else -> {
                false
            }
        }
    }
}