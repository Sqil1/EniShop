package com.eniecole.enishop.dao.network

import com.eniecole.enishop.bo.Article
import com.eniecole.enishop.dao.ArticleDao

class ArticleDaoNetworkImpl: ArticleDao {
    override fun selectById(id: Long): Article {
        TODO("Not yet implement")
    }

    // Méthode de l'interface permettant d'ajouter un nouvel article à la liste
    override fun addNewOne(article: Article): Long {
        TODO("Not yet implement")
    }

    override fun selectAll(): List<Article> {
        TODO("Not yet implemented")
    }
}