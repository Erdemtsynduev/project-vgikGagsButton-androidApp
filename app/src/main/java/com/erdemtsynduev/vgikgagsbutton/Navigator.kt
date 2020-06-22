package com.erdemtsynduev.vgikgagsbutton

import androidx.navigation.NavController
import com.erdemtsynduev.buttons.ButtonsNavigator

open class Navigator : ButtonsNavigator {

    private var navController: NavController? = null

    fun navigateUp() = navController?.navigateUp()

    fun bind(navController: NavController) {
        this.navController = navController
    }

    fun unbind() {
        navController = null
    }
}