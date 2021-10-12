package com.grv.grvworkmanagertest

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.job.JobParameters
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.work.Worker
import androidx.work.WorkerParameters

class UploadWorker(var appContext: Context, workerParams: WorkerParameters):
       Worker(appContext, workerParams) {
    private lateinit var notificationManager: NotificationManager

    override fun doWork(): Result {
        notificationManager = appContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(10101, createNotificationBuilder(applicationContext).build())
        return Result.success()
   }
    private fun createNotificationBuilder(
        context: Context,

    ): NotificationCompat.Builder {
        val pendingIntent = getPendingIntent(context = context)
        val channelId = if (Build.VERSION.SDK_INT > Build.VERSION_CODES.O) {
            createNotificationChannel(context)
        } else ""

        val notificationBuilder = getNotificationBuilder(context, pendingIntent, channelId)
        // notificationBuilder.build()
        Log.e("GRV","Alarm Set Successfully")
        return notificationBuilder
    }

    private fun getNotificationBuilder(
        context: Context,
        pendingIntent: PendingIntent,
        channelId: String
    ): NotificationCompat.Builder {
        return NotificationCompat.Builder(context, channelId)
            .setContentTitle("GRV WM   title")
            .setContentText("GRV WM Content")
            .setSmallIcon(R.drawable.ic_notification_icon)
            .setContentIntent(pendingIntent)
            .setTicker("Work Manager Ticker")

    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel(context: Context): String {
        val channelId = "PortFolioReminder"
        val channelName = "Portfolio Reminder"
        val channel =
            NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH)
        // val service = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
        return channelId
    }

    private fun getPendingIntent(context: Context) =
        PendingIntent.getActivity(context, 0, Intent(), 0)
}
