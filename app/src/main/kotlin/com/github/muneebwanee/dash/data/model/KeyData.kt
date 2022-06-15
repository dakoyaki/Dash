package com.github.dakoyaki.dash.data.model

/**
 * Created by dakoyaki on 15/12/20.
 */
class KeyData {

    var keyID: String? = null
    var keyText: String? = null

    constructor()

    constructor(keyId: String, keyText: String) {
        this.keyID = keyId
        this.keyText = keyText
    }

}