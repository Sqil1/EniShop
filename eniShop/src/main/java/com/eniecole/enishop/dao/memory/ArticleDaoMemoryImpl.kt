package com.eniecole.enishop.dao.memory

import android.os.Build
import androidx.annotation.RequiresApi
import com.eniecole.enishop.bo.Article
import com.eniecole.enishop.dao.ArticleDao
import java.time.LocalDate

class ArticleDaoMemoryImpl : ArticleDao {

    val articlesInMemory = mutableListOf<Article>(
        Article(1L,"Ordinateur Gamer",1599.99,"Ordinateur puissant pour Gamer","https://",LocalDate.now()),
        Article(2L,"Ordinateur Gamer",1599.99,"Ordinateur puissant pour Gamer","https://",LocalDate.now()),
        Article(3L,"Ordinateur Gamer",1599.99,"Ordinateur puissant pour Gamer","https://",LocalDate.now())
        )


    // Méthode de l'interface permettant de récupérer un article par son ID
    override fun selectById(id: Long): Article {
        // Parcourir la liste pour trouver l'article avec l'ID donné
        return articlesInMemory.first { it.id == id }
    }
    // Méthode de l'interface permettant d'ajouter un nouvel article à la liste
    override fun addNewOne(article: Article): Long {
        val numberOfArticles = articlesInMemory.size
        //l'article en entrée aura toujours son ID mis à jour avec une incrémentation
        articlesInMemory.add(article.copy(id=numberOfArticles+1L))
        return numberOfArticles+1L
    }

}