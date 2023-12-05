package com.eniecole.enishop.repository

import com.eniecole.enishop.bo.Article
import com.eniecole.enishop.dao.DaoFactory
import com.eniecole.enishop.dao.DaoType


object ArticleRepository {

    private val articleDaoMem = DaoFactory.createArticleDao(DaoType.MEMORY)
    private val articleDaoNet = DaoFactory.createArticleDao(DaoType.NETWORK)

    fun getArticleById(id: Long): Article {
        return articleDaoMem.selectById(id)
    }

    fun addNewArticle(article: Article): Long {
        return articleDaoMem.addNewOne(article)
    }

}