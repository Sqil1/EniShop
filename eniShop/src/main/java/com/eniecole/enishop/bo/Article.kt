package com.eniecole.enishop.bo

import java.time.LocalDate

data class Article (
    val id:Long = 0L,
    var title: String,
    var price: Double,
    var description: String,
    var imgUrl: String,
    val dateSortie: LocalDate
)