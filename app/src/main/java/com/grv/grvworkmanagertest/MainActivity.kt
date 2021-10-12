package com.grv.grvworkmanagertest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "onCreate()")
        btn = findViewById(R.id.btn_)
        btn.setOnClickListener {

            startActivity(Intent(this, SecondActivity::class.java))
            /*val constraints: Constraints =Constraints.Builder()
                    .build()

            val periodicWorkRequest = PeriodicWorkRequest.Builder(UploadWorker::class.java, 2, TimeUnit.HOURS)
                    .setConstraints(constraints)
                    .build()

            WorkManager.getInstance(this).enqueueUniquePeriodicWork("10101",
                    ExistingPeriodicWorkPolicy.KEEP, periodicWorkRequest);*/

        }
        //test()

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
    private fun test() {
        Test().test()
    }
}