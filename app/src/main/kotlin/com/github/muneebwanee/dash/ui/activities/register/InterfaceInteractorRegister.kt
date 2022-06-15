package com.github.dakoyaki.dash.ui.activities.register

import com.github.dakoyaki.dash.di.PerActivity
import com.github.dakoyaki.dash.ui.activities.base.InterfaceInteractor

/**
 * Created by dakoyaki on 15/12/20.
 */
@PerActivity
interface InterfaceInteractorRegister<V : InterfaceViewRegister> : InterfaceInteractor<V> {

    fun signUpDisposable(email: String, pass: String)

}