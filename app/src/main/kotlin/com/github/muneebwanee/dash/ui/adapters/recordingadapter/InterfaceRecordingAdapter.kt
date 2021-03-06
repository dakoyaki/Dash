package com.github.dakoyaki.dash.ui.adapters.recordingadapter

import com.github.dakoyaki.dash.ui.adapters.basedapter.InterfaceAdapter
import java.io.File

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceRecordingAdapter : InterfaceAdapter{
    fun onCheckPermissionAudioRecord(key:String?,file: File, childName: String, fileName: String, holder: RecordingViewHolder,position:Int)
    fun onClickDownloadAudioRecord(file: File, childName: String, holder: RecordingViewHolder)
    fun onLongClickDeleteFileRecord(keyFileName: String?, fileName: String, childName: String,position:Int)

}