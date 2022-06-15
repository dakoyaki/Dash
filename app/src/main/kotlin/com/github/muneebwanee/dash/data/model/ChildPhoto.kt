package com.github.dakoyaki.dash.data.model

/**
 * Created by dakoyaki on 15/12/20.
 */
class ChildPhoto {

    var capturePhoto: Boolean? = null
    var facingPhoto: Int? = null

    constructor() {}

    constructor(capturePhoto: Boolean?, facingPhoto: Int?) {
        this.capturePhoto = capturePhoto
        this.facingPhoto = facingPhoto
    }

}