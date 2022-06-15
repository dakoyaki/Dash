package com.github.dakoyaki.dash.services.base

import android.content.Context
import com.github.dakoyaki.dash.data.rxFirebase.InterfaceFirebase
import com.google.firebase.auth.FirebaseUser

/**
 * Created by dakoyaki on 15/12/20.
 */
interface InterfaceInteractorService<S : InterfaceService> {

    fun onAttach(service: S)

    fun onDetach()

    fun getService(): S?

    fun isNullService() : Boolean

    fun getContext(): Context

    fun firebase(): InterfaceFirebase

    fun user(): FirebaseUser?

}