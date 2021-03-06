package com.github.dakoyaki.dash.utils.hiddenCameraServiceUtils.config

import androidx.annotation.IntDef

/**
 * Created by dakoyaki on 15/12/20.
 */
class CameraImageFormat{

    init {
        throw RuntimeException("Cannot initialize CameraImageFormat.")
    }

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(FORMAT_JPEG)
    annotation class SupportedImageFormat

    companion object {
        const val FORMAT_JPEG = 849
    }
}
