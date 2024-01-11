package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen.watchteam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentGeleriosBinding


class Gelerios : Fragment() {
    lateinit var binding : FragmentGeleriosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGeleriosBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}