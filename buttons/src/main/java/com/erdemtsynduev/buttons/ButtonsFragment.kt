package com.erdemtsynduev.buttons

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.erdemtsynduev.buttons.databinding.FragmentButtonsBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ButtonsFragment: Fragment(R.layout.fragment_buttons){

    private lateinit var binding: FragmentButtonsBinding

    private val viewModelButtons: ButtonsViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentButtonsBinding.bind(view)
        binding.viewModel = viewModelButtons
        binding.lifecycleOwner = this
    }
}
