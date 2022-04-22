package com.example.libraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.toasterlibrary.ToasterMessage

/* Qui si sperimenta la creazione di librerie!!! di ogni genere (testing e no)


 */

/* CONCETTI:

    - TESTABILITA' !!!!!
        Una libreria AAR ha il suo manifest e ha anche le sue cartelline di testing!!!! strumentale e non!!!! perche' e' un modulo come tutti gli altri!!!

    - Path classi:
        Di solito si scrive dentro main/java/ e cartellina modulo!!!!!
 */



class MainActivity : AppCompatActivity() {

    //si istanza la classe della libreria
    //var toaster = ToasterMessage()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //comportamento libreria esterna
        findViewById<Button>(R.id.ToastButton).setOnClickListener {
            Log.d("giuseppeLibrary", " premuto pulsante")
            ToasterMessage.toastMessage(this, "Caricata local custom library")
        }
    }
}