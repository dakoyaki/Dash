package com.github.dakoyaki.dash.di.module

import android.app.Service
import android.content.Context
import com.github.dakoyaki.dash.di.PerService
import com.github.dakoyaki.dash.services.calls.InteractorCalls
import com.github.dakoyaki.dash.services.calls.InterfaceInteractorCalls
import com.github.dakoyaki.dash.services.calls.InterfaceServiceCalls
import com.github.dakoyaki.dash.services.sms.InteractorSms
import com.github.dakoyaki.dash.services.sms.InterfaceInteractorSms
import com.github.dakoyaki.dash.services.sms.InterfaceServiceSms
import dagger.Module
import dagger.Provides

/**
 * Created by dakoyaki on 15/12/20.
 */
@Module
class ServiceModule(var service:Service) {

    @Provides
    fun provideContext(): Context = service.applicationContext

    @Provides
    @PerService
    fun provideInterfaceInteractorCalls(interactor: InteractorCalls<InterfaceServiceCalls>): InterfaceInteractorCalls<InterfaceServiceCalls> = interactor

    @Provides
    @PerService
    fun provideInterfaceInteractorSms(interactor: InteractorSms<InterfaceServiceSms>): InterfaceInteractorSms<InterfaceServiceSms> = interactor

}