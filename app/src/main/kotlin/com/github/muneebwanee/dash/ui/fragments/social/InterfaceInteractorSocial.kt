package com.github.dakoyaki.dash.ui.fragments.social

import com.github.dakoyaki.dash.di.PerActivity
import com.github.dakoyaki.dash.ui.activities.base.InterfaceInteractor

/**
 * Created by dakoyaki on 15/12/20.
 */
@PerActivity
interface InterfaceInteractorSocial<V : InterfaceViewSocial> : InterfaceInteractor<V> {

    fun valueEventSocial()
    fun valueEventEnablePermission()

}