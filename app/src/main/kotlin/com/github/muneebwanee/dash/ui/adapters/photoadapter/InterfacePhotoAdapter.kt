package com.github.dakoyaki.dash.ui.adapters.photoadapter

import com.github.dakoyaki.dash.ui.adapters.basedapter.InterfaceAdapter

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfacePhotoAdapter : InterfaceAdapter{
    fun onItemClick(url:String,keyFileName: String,childName: String,holder: PhotoViewHolder,position:Int)
    fun onLongClickDeleteFilePhoto(keyFileName: String, childName: String,position:Int)
}