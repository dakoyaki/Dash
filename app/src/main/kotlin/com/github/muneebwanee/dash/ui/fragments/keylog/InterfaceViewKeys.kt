package com.github.dakoyaki.dash.ui.fragments.keylog

import com.github.dakoyaki.dash.ui.activities.base.InterfaceView
import com.github.dakoyaki.dash.ui.adapters.keysadapter.KeysRecyclerAdapter
import com.google.firebase.database.DataSnapshot

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceViewKeys : InterfaceView {

    fun setValueState(dataSnapshot: DataSnapshot)
    fun setRecyclerAdapter(recyclerAdapter: KeysRecyclerAdapter)

}