package com.github.dakoyaki.dash.ui.fragments.maps

import com.github.dakoyaki.dash.data.model.Location
import com.github.dakoyaki.dash.ui.activities.base.InterfaceView
import com.google.firebase.database.DataSnapshot

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceViewMaps : InterfaceView {
    fun setLocation(location: Location)
    fun setValueState(dataSnapshot: DataSnapshot)
    fun setValuePermission(dataSnapshot: DataSnapshot)
}