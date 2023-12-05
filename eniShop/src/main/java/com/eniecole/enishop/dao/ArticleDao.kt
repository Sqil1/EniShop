package com.eniecole.enishop.dao

import com.eniecole.enishop.bo.Article

// Interface définissant les opérations possibles sur les articles
interface ArticleDao {
    fun selectById(id: Long): Article
    fun addNewOne(article: Article): Long

    companion object {
        // Companion object pour créer une instance de la Dao en fonction du DaoType
        fun create(daoType: DaoType): ArticleDao {
            return DaoFactory.createArticleDao(daoType)
        }
    }
}