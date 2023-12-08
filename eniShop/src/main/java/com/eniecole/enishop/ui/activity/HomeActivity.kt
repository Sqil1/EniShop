package com.eniecole.enishop.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eniecole.enishop.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val fabAddArticle = findViewById<FloatingActionButton>(R.id.fabAddArticle)
        fabAddArticle.setOnClickListener{
            startActivity(Intent(this,AjoutArticleActivity::class.java))
        }
    }

}