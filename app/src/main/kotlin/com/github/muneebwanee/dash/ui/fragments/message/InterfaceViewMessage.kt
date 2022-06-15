package com.github.dakoyaki.dash.ui.fragments.message

import com.github.dakoyaki.dash.ui.activities.base.InterfaceView
import com.github.dakoyaki.dash.ui.adapters.smsadapter.SmsRecyclerAdapter

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceViewMessage : InterfaceView {

    fun setRecyclerAdapter(smsRecyclerAdapter: SmsRecyclerAdapter)

}