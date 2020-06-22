package com.erdemtsynduev.vgikgagsbutton

import android.app.Application
import com.erdemtsynduev.buttons.di.buttonsModule
import com.erdemtsynduev.vgikgagsbutton.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ExtendApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@ExtendApplication)
            modules(
                mutableListOf(
                    appModule,
                    buttonsModule
                )
            )
        }
    }
}
