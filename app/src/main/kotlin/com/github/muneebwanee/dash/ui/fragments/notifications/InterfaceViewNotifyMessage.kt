package com.github.dakoyaki.dash.ui.fragments.notifications

import com.github.dakoyaki.dash.ui.activities.base.InterfaceView
import com.github.dakoyaki.dash.ui.adapters.notifyadapter.NotifyMessageRecyclerAdapter
import com.google.firebase.database.DataSnapshot

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceViewNotifyMessage : InterfaceView {

    fun setRecyclerAdapter(recyclerAdapter: NotifyMessageRecyclerAdapter)
    fun setValueState(dataSnapshot: DataSnapshot)

}