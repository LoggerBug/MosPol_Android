package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    lateinit var binding : FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goNext()
    }

    fun goNext(){
        val controller = findNavController()
        binding.start.setOnClickListener {
            controller.navigate(R.id.startGame)
        }

        binding.legue.setOnClickListener {
            controller.navigate(R.id.legueTable)
        }

        binding.contact.setOnClickListener {
            controller.navigate(R.id.contactUs)
        }

        binding.policy.setOnClickListener {
            controller.navigate(R.id.privatePolicy)
        }

    }

}