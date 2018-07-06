package bkoruznjak.from.hr.parker.view.menu

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import bkoruznjak.from.hr.parker.R
import org.koin.android.ext.android.inject

class MenuActivity : AppCompatActivity() {

    val menuViewModel: MenuViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }
}
