package com.github.dakoyaki.dash.ui.fragments.notifications

import com.github.dakoyaki.dash.ui.activities.base.InterfaceInteractor

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceInteractorNotifyMessage<V : InterfaceViewNotifyMessage> : InterfaceInteractor<V> {
    fun valueEventEnableNotifications()
}