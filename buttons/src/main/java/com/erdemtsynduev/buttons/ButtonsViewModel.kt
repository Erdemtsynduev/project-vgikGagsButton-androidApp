package com.erdemtsynduev.buttons

import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel

class ButtonsViewModel : ViewModel() {

    val mode = ObservableInt(Int.MIN_VALUE)

    fun playSound() = playTuturu()

    private fun playTuturu(){
        mode.set(1)
    }
}
