package com.eniecole.enishop.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eniecole.enishop.databinding.ActivityMainBinding
import com.eniecole.enishop.repository.ArticleRepository
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    //on créé une variable qui conteindra toutes nos vues
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // on récupère notre binding (qui contient toutes nos vues)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //on affiche toute notre vue => layout
        setContentView(binding.root)
        binding.article = ArticleRepository.getArticleById(1L)

        binding.buttonSave.setOnClickListener {
            Snackbar.make(it,"Vous venez de créer ${binding.article?.title} vendu pour un " +
                    "${binding.article?.price}€",Snackbar.LENGTH_LONG).show()
        }
    }
}