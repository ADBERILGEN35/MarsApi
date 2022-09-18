package com.example.marsretrofit.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.marsretrofit.R
import com.example.marsretrofit.databinding.FragmentMarsDetailBinding


class MarsDetailFragment : Fragment() {

    private lateinit var binding: FragmentMarsDetailBinding

    private val navArgs: MarsDetailFragmentArgs? by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_mars_detail, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataPlanet()
        binding.buttonBack.setOnClickListener {
            findNavController().apply {
                findNavController().navigate(R.id.routeDetailToHome)
            }
        }

    }


    /**
     * Data planet
     * Object list{}
     */
    private fun dataPlanet() {
        navArgs?.let { list ->
            binding.planetObject = list.planetModel
        }
    }
}