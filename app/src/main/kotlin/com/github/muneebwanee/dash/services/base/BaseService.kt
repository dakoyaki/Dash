package com.github.dakoyaki.dash.services.base

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.github.dakoyaki.dash.app.Dash
import com.github.dakoyaki.dash.di.component.DaggerServiceComponent
import com.github.dakoyaki.dash.di.component.ServiceComponent
import com.github.dakoyaki.dash.di.module.ServiceModule
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by dakoyaki on 15/12/20.
 */
abstract class BaseService : Service(), InterfaceService {


    private lateinit var compositeDisposable: CompositeDisposable

    companion object {
        @JvmStatic
        lateinit var serviceComponent: ServiceComponent
    }

    override fun onBind(p0: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        serviceComponent = DaggerServiceComponent.builder()
                .serviceModule(ServiceModule(this))
                .appComponent(Dash.appComponent).build()
        compositeDisposable = CompositeDisposable()
    }

    override fun getComponent(): ServiceComponent? = serviceComponent


    override fun addDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    override fun clearDisposable() = compositeDisposable.clear()


}
