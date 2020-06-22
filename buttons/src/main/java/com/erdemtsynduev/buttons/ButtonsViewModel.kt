package com.erdemtsynduev.buttons

import android.content.Context
import android.media.MediaPlayer
import androidx.lifecycle.ViewModel

class ButtonsViewModel(private val contextData: Context) : ViewModel() {

    fun playSound() = playTuturu()

    private fun playTuturu() {
        val resId = contextData.resources.getIdentifier(R.raw.tuturu.toString(), "raw", contextData.packageName)
        val mediaPlayer = MediaPlayer.create(contextData, resId)
        mediaPlayer.start()
    }
}
