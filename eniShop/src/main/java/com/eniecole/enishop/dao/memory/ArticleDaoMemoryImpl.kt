package com.eniecole.enishop.dao.memory

import com.eniecole.enishop.bo.Article
import com.eniecole.enishop.dao.ArticleDao
import java.time.LocalDate

class ArticleDaoMemoryImpl : ArticleDao {

    val articlesInMemory = mutableListOf<Article>(
        Article(1L,"MacbookPro",4000.0,"Ordinateur très cher","https://", LocalDate.now()),
        Article(2L,"HPEnvy",2000.0,"Ordinateur un peu moins cher mais moins qualit","https://", LocalDate.now()),
        Article(3L,"Dell XPS",2500.0,"Ordinateur quali et pas trop cher","https://", LocalDate.now())
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

    override fun selectAll(): List<Article> = articlesInMemory

}