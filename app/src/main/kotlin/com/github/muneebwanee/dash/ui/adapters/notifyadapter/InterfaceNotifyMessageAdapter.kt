package com.github.dakoyaki.dash.ui.adapters.notifyadapter

import com.github.dakoyaki.dash.ui.adapters.basedapter.InterfaceAdapter


/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceNotifyMessageAdapter : InterfaceAdapter{
    fun onItemClick(key: String?, child: String,position:Int)
    fun onItemLongClick(key: String?, child: String,position:Int)
}