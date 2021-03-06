package com.github.dakoyaki.dash.services.notificationService

import android.graphics.Bitmap

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceNotificationListener {

    fun setRunService(run : Boolean)
    fun getNotificationExists(id:String,exec:() -> Unit)
    fun setDataMessageNotification(type:Int,text:String?,title:String?,nameImage:String?,image:Bitmap?)

}