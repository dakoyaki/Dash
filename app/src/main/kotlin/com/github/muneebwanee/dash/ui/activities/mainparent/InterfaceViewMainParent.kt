package com.github.dakoyaki.dash.ui.activities.mainparent

import com.github.dakoyaki.dash.ui.activities.base.InterfaceView
import com.google.firebase.database.DataSnapshot

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceViewMainParent : InterfaceView {
    fun signOutView()
    fun onFinishCount()
    fun setCheckedNavigationItem(id: Int)
    fun closeNavigationDrawer()
    fun requestApplyInsets()
    fun setDataAccounts(data: DataSnapshot)
}