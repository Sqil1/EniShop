package com.eniecole.enishop.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.eniecole.enishop.databinding.ActivityAjoutArticleBinding
import com.eniecole.enishop.repository.ArticleRepository
import com.google.android.material.snackbar.Snackbar
import java.time.LocalDate

private const val TAG = "MainActivity"
class AjoutArticleActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAjoutArticleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAjoutArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.article = ArticleRepository.getArticle(1L)
        //logd logi
        Log.d(TAG, "onCreate: ${ArticleRepository.getArticle(1L)}")
        binding.buttonSave.setOnClickListener {
            Snackbar.make(
                it, "Vous venez de créer ${binding.article?.title} vendu pour un" +
                        "montant de ${binding.article?.price}€", Snackbar.LENGTH_LONG
            ).show()
            val articleSauvegarde = binding.article!!.copy(
                imgUrl = "https://image.jpg",
                price = binding.editTextPrix.text.toString().toDoubleOrNull() ?: -1.0,
                dateSortie = LocalDate.now()
            )
            ArticleRepository.addArticle(articleSauvegarde)
            finish()
        }
    }
}