package se.linerotech.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeRedFragment()
        initializeBlueFragment()
    }

    private fun initializeRedFragment() {
        // Without Arguments
        /*
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.redContainer, RedFragment())
            .commit()
         */

        // With Arguments
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.redContainer, RedFragment.instance("Calling from Red"))
            .commit()
    }

    private fun initializeBlueFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.blueContainer, BlueFragment())
            .commit()
    }
}
