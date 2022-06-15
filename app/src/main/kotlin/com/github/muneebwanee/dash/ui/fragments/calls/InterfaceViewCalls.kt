package com.github.dakoyakish.ui.fragments.calls

import com.github.dakoyakish.ui.activities.base.InterfaceView
import com.github.dakoyakish.ui.adapters.callsadapter.CallsRecyclerAdapter

/**
 * Created by dakoyaki 15/12/20.
 */
interface InterfaceViewCalls : InterfaceView {

    fun setRecyclerAdapter(recyclerAdapter: CallsRecyclerAdapter)

}