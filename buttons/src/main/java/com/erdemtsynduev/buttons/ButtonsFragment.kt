package com.erdemtsynduev.buttons

import android.media.MediaPlayer
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.erdemtsynduev.baseui.addOnPropertyChanged
import com.erdemtsynduev.buttons.databinding.FragmentButtonsBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ButtonsFragment : Fragment(R.layout.fragment_buttons) {

    private lateinit var binding: FragmentButtonsBinding

    private val viewModel: ButtonsViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentButtonsBinding.bind(view)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.mode.addOnPropertyChanged {
            playTuturu()
        }
    }

    private fun playTuturu() {
        val resId = resources.getIdentifier(R.raw.tuturu.toString(), "raw", activity?.packageName)
        val mediaPlayer = MediaPlayer.create(this.context, resId)
        mediaPlayer.start()
    }
}
