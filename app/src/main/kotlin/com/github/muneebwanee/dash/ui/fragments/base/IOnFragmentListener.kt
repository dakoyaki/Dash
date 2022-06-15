package com.github.dakoyaki.dash.ui.fragments.base

interface IOnFragmentListener {
    fun onBackPressed(): Boolean
    fun onHideFragment()
}