package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentSecondHistoryBinding


class SecondHistory : Fragment() {
    lateinit var binding : FragmentSecondHistoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondHistoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}