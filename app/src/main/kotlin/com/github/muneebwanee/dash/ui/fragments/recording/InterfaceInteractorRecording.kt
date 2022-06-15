package com.github.dakoyaki.dash.ui.fragments.recording

import com.github.dakoyaki.dash.di.PerActivity
import com.github.dakoyaki.dash.ui.activities.base.InterfaceInteractor

/**
 * Created by dakoyaki on 15/12/20.
 */
@PerActivity
interface InterfaceInteractorRecording <V : InterfaceViewRecording> : InterfaceInteractor<V> {
    fun stopAudioRecordHolder()
    fun getRecordAudio(time:Long)
    fun valueEventEnableRecording()
    fun valueEventTimerRecording()
}