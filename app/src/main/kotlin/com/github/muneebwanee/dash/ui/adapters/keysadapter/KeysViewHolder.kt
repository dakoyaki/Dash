package com.github.dakoyaki.dash.ui.adapters.keysadapter

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.github.dakoyaki.dash.R
import com.github.dakoyaki.dash.data.model.KeyData
import kotterknife.bindView

/**
 * Created by dakoyaki on 15/12/20.
 */
class KeysViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val txtKeyData: TextView by bindView(R.id.txt_key_text)

    fun bind(item: KeyData) {
        txtKeyData.text = item.keyText
    }

}