package com.jyoti.feature2.ui.feature2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jyoti.feature2.R

class Feature2Fragment : Fragment() {

    companion object {
        fun newInstance() = Feature2Fragment()
    }

    private lateinit var viewModel: Feature2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_feature2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Feature2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}