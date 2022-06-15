package com.github.dakoyaki.dash.ui.adapters.smsadapter

import com.github.dakoyaki.dash.ui.adapters.basedapter.InterfaceAdapter

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceSmsAdapter : InterfaceAdapter{
    fun onItemClick(keySms:String,position:Int)
    fun onItemLongClick(keySms:String,position:Int)
}