package com.github.dakoyaki.dash.ui.fragments.message

import com.github.dakoyaki.dash.di.PerActivity
import com.github.dakoyaki.dash.ui.activities.base.InterfaceInteractor

/**
 * Created by dakoyaki on 15/12/20.
 */
@PerActivity
interface InterfaceInteractorMessage<V : InterfaceViewMessage> : InterfaceInteractor<V>