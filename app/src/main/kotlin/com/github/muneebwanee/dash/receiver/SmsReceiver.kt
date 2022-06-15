package com.github.dakoyaki.dash.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Telephony
import com.github.dakoyaki.dash.data.preference.DataSharePreference.typeApp
import com.github.dakoyaki.dash.services.sms.SmsService
import com.github.dakoyaki.dash.utils.Consts.TYPE_SMS_INCOMING
import com.github.dakoyaki.dash.utils.ConstFun.startServiceSms


/**
 * Created by dakoyaki on 15/12/20.
 */
class SmsReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {

        var smsAddress = ""
        var smsBody = ""

        for (smsMessage in Telephony.Sms.Intents.getMessagesFromIntent(intent)) {
            smsAddress = smsMessage.displayOriginatingAddress
            smsBody += smsMessage.messageBody
        }

        if (intent.action == Telephony.Sms.Intents.SMS_RECEIVED_ACTION){
            if (!context.typeApp) context.startServiceSms<SmsService>(smsAddress,smsBody, TYPE_SMS_INCOMING)
        }
    }

}