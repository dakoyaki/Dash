package com.github.dakoyaki.dash.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.github.dakoyaki.dash.services.social.MonitorService
import com.github.dakoyaki.dash.utils.Consts.RESTART_MONITOR_RECEIVER
import com.pawegio.kandroid.IntentFor

/**
 * Created by dakoyaki on 15/12/20.
 */
class MonitorReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == RESTART_MONITOR_RECEIVER) context.startService(IntentFor<MonitorService>(context))
    }
}