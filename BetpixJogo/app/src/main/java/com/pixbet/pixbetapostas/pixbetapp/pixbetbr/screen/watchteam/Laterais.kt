package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen.watchteam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentLateraisBinding


class Laterais : Fragment() {
    lateinit var binding : FragmentLateraisBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLateraisBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}