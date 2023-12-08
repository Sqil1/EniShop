package com.eniecole.enishop.bo

import android.os.Build
import android.os.Parcelable
import androidx.annotation.RequiresApi
import kotlinx.parcelize.Parcelize
import java.time.LocalDate
import java.time.format.DateTimeFormatter


@Parcelize
data class Article (
    val id:Long = 0L,
    var title: String,
    var price: Double,
    var description: String,
    var imgUrl: String,
    val dateSortie: LocalDate
) :Parcelable {

    @RequiresApi(Build.VERSION_CODES.O)
    fun afficheDate() = dateSortie.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
}