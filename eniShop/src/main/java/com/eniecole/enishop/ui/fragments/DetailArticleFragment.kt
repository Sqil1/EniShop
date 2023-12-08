package com.eniecole.enishop.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.eniecole.enishop.R
import com.eniecole.enishop.databinding.FragmentDetailArticleBinding

class DetailArticleFragment : Fragment() {
    private lateinit var binding : FragmentDetailArticleBinding
    val args by navArgs<DetailArticleFragmentArgs>()
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // XML layout en Binding (Kotlin)
        binding = FragmentDetailArticleBinding.inflate(inflater, container, false)
        // Récupération du layout (kotilin) depuis le binding
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.article = args.article
    }
}
