package com.erdemtsynduev.buttons.di

import com.erdemtsynduev.buttons.ButtonsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val buttonsModule = module {
    viewModel { ButtonsViewModel() }
}
