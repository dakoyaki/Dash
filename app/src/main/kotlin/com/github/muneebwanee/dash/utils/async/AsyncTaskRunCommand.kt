package com.github.dakoyaki.dash.utils.async

import android.os.AsyncTask
import com.github.dakoyaki.dash.app.Dash

/**
 * Created by dakoyaki on 15/12/20.
 */
class AsyncTaskRunCommand(private val onPreFunc: (() -> Unit)? = null,
                          private val onPostFunc:((result: Boolean) -> Unit)? = null) :  AsyncTask<String, Boolean, Boolean>() {

    override fun onPreExecute() {
        super.onPreExecute()
        onPreFunc?.invoke()
    }

    override fun doInBackground(vararg params: String?): Boolean {
        return Dash.root.runCommand(params[0]).result
    }

    override fun onPostExecute(result: Boolean) {
        super.onPostExecute(result)
        onPostFunc?.invoke(result)
    }


}