package bkoruznjak.from.hr.parker.root

import android.app.Application
import bkoruznjak.from.hr.parker.di.AppModule
import bkoruznjak.from.hr.parker.di.ViewModelModule
import org.koin.android.ext.android.startKoin

/**
 * Created by bkoruznjak on 16/07/2017.
 */

class ParkerApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(AppModule, ViewModelModule))
    }

}
