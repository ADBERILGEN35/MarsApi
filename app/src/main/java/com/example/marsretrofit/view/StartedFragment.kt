package com.example.marsretrofit.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.marsretrofit.R
import com.example.marsretrofit.databinding.FragmentStartedBinding

class StartedFragment : Fragment() {
    private lateinit var binding: FragmentStartedBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_started, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            buttonLetsGo.setOnClickListener {
                findNavController().apply {
                    findNavController().navigate(R.id.homeFragmentRoute)
                }
            }
        }
    }
}


