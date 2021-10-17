package com.example.menuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //add our menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //here you should write your menu xml file name
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    //this methods helps to decide what to do with each menu item
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.itme_menu_About -> {
                goAboutpage()
                return true
            }
            R.id.item_menu_Help -> {
                goHelpPage()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun goAboutpage(){
        intent=Intent(this, About::class.java)
        startActivity(intent)
    }
    fun goHelpPage(){
        intent= Intent(this, Help::class.java)
        startActivity(intent)
    }
}