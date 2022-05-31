package com.jyoti.feature1.ui.feature1

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jyoti.feature1.R

class Feature1Fragment : Fragment() {

    companion object {
        fun newInstance() = Feature1Fragment()
    }

    private lateinit var viewModel: Feature1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_feature1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Feature1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}