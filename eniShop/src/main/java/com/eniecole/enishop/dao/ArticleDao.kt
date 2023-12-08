package com.eniecole.enishop.dao

import com.eniecole.enishop.bo.Article

// Interface définissant les opérations possibles sur les articles
interface ArticleDao {
    fun selectById(id: Long): Article
    fun addNewOne(article: Article): Long
    fun selectAll() : List<Article>
}