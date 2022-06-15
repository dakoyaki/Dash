package com.github.dakoyaki.dash.utils.hiddenCameraServiceUtils

import java.io.File

/**
 * Created by dakoyaki on 15/12/20.
 */
interface CameraCallbacks {

    fun onImageCapture(imageFile: File)

    fun onCameraError(@CameraError.CameraErrorCodes errorCode: Int)
}
