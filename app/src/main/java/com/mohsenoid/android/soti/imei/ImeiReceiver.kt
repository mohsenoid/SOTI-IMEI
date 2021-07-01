package com.mohsenoid.android.soti.imei

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.mohsenoid.appsettings.AppSettings

class ImeiReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        context ?: return
        intent ?: return

        val imei = intent.getStringExtra(IMEI_KEY) ?: return

        AppSettings.setValue(context, IMEI_KEY, imei)

        Toast.makeText(context, "Received: IMEI: $imei", Toast.LENGTH_LONG).show()
    }

    companion object {
        const val IMEI_KEY = "imei"
    }
}