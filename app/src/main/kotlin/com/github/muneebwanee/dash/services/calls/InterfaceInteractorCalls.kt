package com.github.dakoyaki.dash.services.calls

import com.github.dakoyaki.dash.di.PerService
import com.github.dakoyaki.dash.services.base.InterfaceInteractorService

/**
 * Created by dakoyaki on 15/12/20.
 */
@PerService
interface InterfaceInteractorCalls<S : InterfaceServiceCalls> : InterfaceInteractorService<S> {

    fun startRecording(phoneNumber:String?,type:Int)
    fun stopRecording()

}