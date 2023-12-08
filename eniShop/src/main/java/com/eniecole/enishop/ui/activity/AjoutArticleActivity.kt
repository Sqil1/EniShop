package com.eniecole.enishop.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eniecole.enishop.databinding.ActivityAjoutArticleBinding
import com.eniecole.enishop.repository.ArticleRepository
import com.google.android.material.snackbar.Snackbar

class AjoutArticleActivity : AppCompatActivity() {

    //on créé une variable qui conteindra toutes nos vues
    private lateinit var binding: ActivityAjoutArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // on récupère notre binding (qui contient toutes nos vues)
        binding = ActivityAjoutArticleBinding.inflate(layoutInflater)
        //on affiche toute notre vue => layout
        setContentView(binding.root)
        binding.article = ArticleRepository.getArticleById(1L)

        binding.buttonSave.setOnClickListener {
            Snackbar.make(
                it, "Vous venez de créer ${binding.article?.title} vendu pour un " +
                        "${binding.article?.price}€", Snackbar.LENGTH_LONG
            ).show()
            val articleSauvegarde = binding.article?.copy(

            )

        }
    }
}