package com.grv.grvworkmanagertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    private val TAG="SecondActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG,"onCreate()")
        setContentView(R.layout.activity_second)
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG,"onRestart()")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG,"onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"onDestroy()")
    }
}