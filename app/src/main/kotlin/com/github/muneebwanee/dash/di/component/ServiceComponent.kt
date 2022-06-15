package com.github.dakoyaki.dash.di.component

import com.github.dakoyaki.dash.di.PerService
import com.github.dakoyaki.dash.di.component.AppComponent
import com.github.dakoyaki.dash.di.module.ServiceModule
import com.github.dakoyaki.dash.services.calls.CallsService
import com.github.dakoyaki.dash.services.sms.SmsService
import com.github.dakoyaki.dash.services.social.MonitorService
import dagger.Component

/**
 * Created by dakoyaki on 15/12/20.
 */
@PerService
@Component(dependencies = [AppComponent::class], modules = [ServiceModule::class])
interface ServiceComponent {

    fun inject(callsService: CallsService)
    fun inject(smsService: SmsService)
    fun inject(monitorService: MonitorService)

}