package com.github.dakoyaki.dash.ui.fragments.recording

import com.github.dakoyaki.dash.ui.activities.base.InterfaceView
import com.github.dakoyaki.dash.ui.adapters.recordingadapter.RecordingRecyclerAdapter
import com.google.firebase.database.DataSnapshot

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceViewRecording : InterfaceView {

    fun setValueState(dataSnapshot: DataSnapshot)
    fun setValueTimerRecording(timer: Long)
    fun setRecyclerAdapter(recyclerAdapter: RecordingRecyclerAdapter)

}