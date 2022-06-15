package com.github.dakoyaki.dash.di.component

import com.github.dakoyaki.dash.app.Dash
import com.github.dakoyaki.dash.data.rxFirebase.InterfaceFirebase
import com.github.dakoyaki.dash.di.module.AppModule
import com.github.dakoyaki.dash.di.module.FirebaseModule
import com.github.dakoyaki.dash.services.accessibilityData.AccessibilityDataService
import com.github.dakoyaki.dash.services.notificationService.NotificationService
import dagger.Component
import javax.inject.Singleton

/**
 * Created by dakoyaki on 15/12/20.
 */
@Singleton
@Component(modules = [AppModule::class, FirebaseModule::class])
interface AppComponent {

    fun inject(app: Dash)
    fun inject(accessibilityDataService: AccessibilityDataService)
    fun inject(notificationService: NotificationService)
    fun getInterfaceFirebase(): InterfaceFirebase

}