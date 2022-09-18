package com.example.marsretrofit.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.marsretrofit.BR
import com.example.marsretrofit.R
import com.example.marsretrofit.adapter.MarsAdapter
import com.example.marsretrofit.databinding.FragmentHomeBinding
import com.example.marsretrofit.model.MarsModel
import com.example.marsretrofit.service.MarsApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private var planetModel = ArrayList<MarsModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            recyclerView.setOnClickListener {
                findNavController().apply {
                    findNavController().navigate(R.id.detailFragmentRoute)
                }
            }
        }
        list()
    }

    private fun list() {
        MarsApi.retrofitService.getProperties()
            .enqueue(object : Callback<List<MarsModel>> {
                override fun onResponse(
                    call: Call<List<MarsModel>>,
                    response: Response<List<MarsModel>>,
                ) {
                    response.body()?.let { responseList ->
                        planetModel = ArrayList(responseList)
                        val planetAdapter = MarsAdapter(ArrayList(responseList))

                        val gridLayoutManager = GridLayoutManager(context, 2)
                        binding.apply {
                            recyclerView.layoutManager = gridLayoutManager

                            setVariable(BR.planetAdapter, planetAdapter)

                        }
                    }
                }

                override fun onFailure(call: Call<List<MarsModel>>, t: Throwable) {
                    println(t.message)
                }
            })
    }

}




