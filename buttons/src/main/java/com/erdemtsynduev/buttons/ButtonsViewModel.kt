package com.erdemtsynduev.buttons

import android.content.Context
import android.media.MediaPlayer
import androidx.lifecycle.ViewModel

class ButtonsViewModel(contextData: Context) : ViewModel() {

    var mediaPlayerDejavu: MediaPlayer? = null
    var mediaPlayerJojo: MediaPlayer? = null
    var mediaPlayerMemeCredit: MediaPlayer? = null
    var mediaPlayerMessageSteam: MediaPlayer? = null
    var mediaPlayerMgsWarning: MediaPlayer? = null
    var mediaPlayerNani: MediaPlayer? = null
    var mediaPlayerNyaa: MediaPlayer? = null
    var mediaPlayerRoblox: MediaPlayer? = null
    var mediaPlayerTuturu: MediaPlayer? = null
    var mediaPlayerYeah: MediaPlayer? = null

    init {
        mediaPlayerDejavu = MediaPlayer.create(contextData, R.raw.deja_vu)
        mediaPlayerJojo = MediaPlayer.create(contextData, R.raw.jojo_reference)
        mediaPlayerMemeCredit = MediaPlayer.create(contextData, R.raw.meme_de_creditos_finales)
        mediaPlayerMessageSteam = MediaPlayer.create(contextData, R.raw.message_steam)
        mediaPlayerMgsWarning = MediaPlayer.create(contextData, R.raw.mgs_warning)
        mediaPlayerNani = MediaPlayer.create(contextData, R.raw.nani)
        mediaPlayerNyaa = MediaPlayer.create(contextData, R.raw.nyaa)
        mediaPlayerRoblox = MediaPlayer.create(contextData, R.raw.roblox_death_sound_effect)
        mediaPlayerTuturu = MediaPlayer.create(contextData, R.raw.tuturu)
        mediaPlayerYeah = MediaPlayer.create(contextData, R.raw.yeah)
    }

    fun playSoundDejavu() = mediaPlayerDejavu?.start()
    fun playSoundJojo() = mediaPlayerJojo?.start()
    fun playSoundMemeCredit() = mediaPlayerMemeCredit?.start()
    fun playSoundMessageSteam() = mediaPlayerMessageSteam?.start()
    fun playSoundMgsWarning() = mediaPlayerMgsWarning?.start()
    fun playSoundNani() = mediaPlayerNani?.start()
    fun playSoundNyaa() = mediaPlayerNyaa?.start()
    fun playSoundRoblox() = mediaPlayerRoblox?.start()
    fun playSoundTuturu() = mediaPlayerTuturu?.start()
    fun playSoundYeah() = mediaPlayerYeah?.start()
}
