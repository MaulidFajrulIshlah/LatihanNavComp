package com.geminiboy.latihannavcomp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geminiboy.latihannavcomp.R
import com.geminiboy.latihannavcomp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            val dapatData = arguments?.getString("username")
            binding.welcome.setText(dapatData)
            binding.imageView.setOnClickListener{
                val inputHome = binding.welcome.text.toString()
                val bund = Bundle()
                bund.putString("home", inputHome)
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment, bund)
            }

        }

}