package com.mohsenoid.android.soti.imei

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mohsenoid.appsettings.AppSettings

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showImei()

        findViewById<Button>(R.id.btRefresh).setOnClickListener {
            showImei()
        }
    }

    private fun showImei() {
        findViewById<TextView>(R.id.tvImei).text = "IMEI: ${AppSettings.getString(this, ImeiReceiver.IMEI_KEY)}"
    }
}