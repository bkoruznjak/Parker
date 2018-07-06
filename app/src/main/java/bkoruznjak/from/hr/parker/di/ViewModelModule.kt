package bkoruznjak.from.hr.parker.di

import bkoruznjak.from.hr.parker.view.menu.MenuViewModel
import org.koin.android.architecture.ext.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

val ViewModelModule: Module = applicationContext {
    viewModel { MenuViewModel() }
}