package com.github.dakoyaki.dash.ui.fragments.photo

import com.github.dakoyaki.dash.ui.activities.base.InterfaceView
import com.github.dakoyaki.dash.ui.adapters.photoadapter.PhotoRecyclerAdapter
import com.google.firebase.database.DataSnapshot

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceViewPhoto : InterfaceView{

    fun setRecyclerAdapter(recyclerAdapter: PhotoRecyclerAdapter)

    fun setValueState(dataSnapshot: DataSnapshot)
    fun setValuePermission(dataSnapshot: DataSnapshot)

}