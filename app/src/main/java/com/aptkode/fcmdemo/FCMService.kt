package com.aptkode.fcmdemo

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class FCMService: FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        Log.d("FCM", "token: $token");
    }

}