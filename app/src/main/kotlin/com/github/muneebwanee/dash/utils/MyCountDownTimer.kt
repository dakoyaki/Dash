package com.github.dakoyaki.dash.utils

import android.os.CountDownTimer
import com.github.dakoyaki.dash.utils.Consts.TAG
import com.pawegio.kandroid.i

/**
 * Created by dakoyaki on 15/12/20.
 */
class MyCountDownTimer(startTime: Long, interval: Long,private val timer:((timer:Long)->Unit)?=null,
                       private val func: () -> Unit) : CountDownTimer(startTime, interval) {
    override fun onFinish() = func()
    override fun onTick(t: Long) { i(TAG,"timer $t") ; timer?.invoke(t) }
}