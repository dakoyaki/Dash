package com.github.dakoyaki.dash.ui.fragments.keylog

import com.github.dakoyaki.dash.di.PerActivity
import com.github.dakoyaki.dash.ui.activities.base.InterfaceInteractor

/**
 * Created by dakoyaki on 15/12/20.
 */
@PerActivity
interface InterfaceInteractorKeys<V : InterfaceViewKeys> : InterfaceInteractor<V> {
    fun valueEventEnableKeys()
}