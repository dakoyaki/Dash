package com.github.dakoyaki.dash.services.base

import com.github.dakoyaki.dash.di.component.ServiceComponent
import io.reactivex.disposables.Disposable

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceService {

    fun getComponent(): ServiceComponent?

    fun addDisposable(disposable: Disposable)

    fun clearDisposable()

}