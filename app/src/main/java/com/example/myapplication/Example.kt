package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import androidx.core.app.NotificationCompat

class Example {
    companion object{


    }
    fun sum(x:Double,y:Double): Double {
        return (x + y)
    }
    fun multi(x:Double, y:Double): Double {
        return (x * y)
    }
    fun divide(x:Double,y:Double): Double {
        return (x / y)
    }
    fun sub(x:Double,y:Double): Double {
        return (x - y)
    }
    lateinit var  b:Notification.Builder
    private val id:String ="123"
    private val name:String ="com.example"
    @SuppressLint("NewApi", "SuspiciousIndentation")
    fun notification(context: Context,toActivity:Class<*>): Unit {

        val nm:NotificationManager =context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val intent= Intent(context,toActivity)
        val i :PendingIntent =PendingIntent.getActivity(context,1,intent,PendingIntent.FLAG_UPDATE_CURRENT)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

            val channel =NotificationChannel(this.id,this.name,NotificationManager.IMPORTANCE_HIGH)
            nm.createNotificationChannel(channel)
            b =Notification.Builder(context,this.id)
                .setContentTitle("Test")
                .setContentText("Fetching Documentation .....")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentIntent(i)
                .setLargeIcon(BitmapFactory.decodeResource(context.resources,R.drawable.ic_launcher_background))


        }else b =Notification.Builder(context)
            .setContentTitle("Test")
            .setContentText("Fetching Documentation .....")
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setContentIntent(i)

        nm.notify(123,b.build())
    }

}