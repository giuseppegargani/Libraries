package com.example.toasterlibrary

import android.content.Context
import android.widget.Toast

/* Ci sono delle importazioni che si possono fare!!!!!

 */

class ToasterMessage {
    companion object {
        fun toastMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}