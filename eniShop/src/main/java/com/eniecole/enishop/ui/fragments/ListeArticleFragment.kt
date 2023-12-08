package com.eniecole.enishop.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.eniecole.enishop.R
import com.eniecole.enishop.repository.ArticleRepository


class ListeArticleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_liste_article, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.buttonToDetail)
        val textView= view.findViewById<TextView>(R.id.textViewAffichageArticles)
        val article = ArticleRepository.getArticleById(1L)
            textView.text = article.toString()
        button.setOnClickListener {
            val direction = ListeArticleFragmentDirections.actionListeToDetail(article)
            findNavController().navigate(direction)
        }
    }
}