package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentFourthHistoryBinding


class FourthHistory : Fragment() {
    lateinit var binding : FragmentFourthHistoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFourthHistoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}