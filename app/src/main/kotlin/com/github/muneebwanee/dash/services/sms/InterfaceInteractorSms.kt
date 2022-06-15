package com.github.dakoyaki.dash.services.sms

import com.github.dakoyaki.dash.di.PerService
import com.github.dakoyaki.dash.services.base.InterfaceInteractorService

/**
 * Created by dakoyaki on 15/12/20.
 */
@PerService
interface InterfaceInteractorSms<S : InterfaceServiceSms> : InterfaceInteractorService<S> {

    fun setPushSms(smsAddress: String, smsBody: String,type: Int)

}