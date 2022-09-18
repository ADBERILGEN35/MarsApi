package com.example.marsretrofit.adapter

import androidx.databinding.ViewDataBinding
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.marsretrofit.BR
import com.example.marsretrofit.databinding.CardDesingBinding
import com.example.marsretrofit.model.MarsModel
import com.example.marsretrofit.view.HomeFragmentDirections

class MarsViewHolder(
    private val marsDataBinding: ViewDataBinding
) :
    RecyclerView.ViewHolder(marsDataBinding.root) {

    fun onBind(marsModel: MarsModel) {
        val binding = marsDataBinding as CardDesingBinding

        binding.apply {
            setVariable(BR.planetObject, marsModel)

            imageViewMars.setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(
                        HomeFragmentDirections.detailFragmentRoute(
                            marsModel
                        )
                    )
            }
        }
    }
}