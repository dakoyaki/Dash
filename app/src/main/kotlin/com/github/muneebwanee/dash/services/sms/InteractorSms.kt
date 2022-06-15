package com.github.dakoyaki.dash.services.sms

import android.content.Context
import com.github.dakoyaki.dash.data.rxFirebase.InterfaceFirebase
import com.github.dakoyaki.dash.data.model.Sms
import com.github.dakoyaki.dash.services.base.BaseInteractorService
import com.github.dakoyaki.dash.utils.ConstFun.getDateTime
import com.github.dakoyaki.dash.utils.Consts.DATA
import com.github.dakoyaki.dash.utils.Consts.SMS
import javax.inject.Inject

/**
 * Created by dakoyaki on 15/12/20.
 */
class InteractorSms<S : InterfaceServiceSms> @Inject constructor(context: Context, firebase: InterfaceFirebase) : BaseInteractorService<S>(context, firebase), InterfaceInteractorSms<S> {

    override fun setPushSms(smsAddress: String, smsBody: String,type: Int) {
        val sms = Sms(smsAddress, smsBody, getDateTime(),type)
        firebase().getDatabaseReference("$SMS/$DATA").push().setValue(sms).addOnCompleteListener {
            if (isNullService()) getService()!!.stopServiceSms()
        }
    }

}