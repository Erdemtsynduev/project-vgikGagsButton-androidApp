package com.erdemtsynduev.vgikgagsbutton.di

import com.erdemtsynduev.buttons.ButtonsNavigator
import com.erdemtsynduev.vgikgagsbutton.Navigator
import org.koin.dsl.module

val appModule = module {

    single<ButtonsNavigator> { Navigator() }
}