package com.june.customtabs

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.browser.customtabs.CustomTabsIntent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun customTabsButtonClicked(v: View) {
        val _uri = "http://stackoverflow.com"
        val uri = Uri.parse(_uri)

        CustomTabsIntent.Builder().build().also { customTabsIntent ->
            customTabsIntent.launchUrl(this, uri)
        }
    }
}