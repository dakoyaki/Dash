package com.github.dakoyaki.dash.di.module

import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.dakoyaki.dash.di.PerActivity
import com.github.dakoyaki.dash.ui.activities.login.InteractorLogin
import com.github.dakoyaki.dash.ui.activities.login.InterfaceInteractorLogin
import com.github.dakoyaki.dash.ui.activities.login.InterfaceViewLogin
import com.github.dakoyaki.dash.ui.activities.mainparent.InteractorMainParent
import com.github.dakoyaki.dash.ui.activities.mainparent.InterfaceInteractorMainParent
import com.github.dakoyaki.dash.ui.activities.mainparent.InterfaceViewMainParent
import com.github.dakoyaki.dash.ui.activities.register.InteractorRegister
import com.github.dakoyaki.dash.ui.activities.register.InterfaceInteractorRegister
import com.github.dakoyaki.dash.ui.activities.register.InterfaceViewRegister
import com.github.dakoyaki.dash.ui.fragments.calls.InteractorCalls
import com.github.dakoyaki.dash.ui.fragments.calls.InterfaceInteractorCalls
import com.github.dakoyaki.dash.ui.fragments.calls.InterfaceViewCalls
import com.github.dakoyaki.dash.ui.fragments.photo.InteractorPhoto
import com.github.dakoyaki.dash.ui.fragments.photo.InterfaceInteractorPhoto
import com.github.dakoyaki.dash.ui.fragments.photo.InterfaceViewPhoto
import com.github.dakoyaki.dash.ui.fragments.keylog.InteractorKeys
import com.github.dakoyaki.dash.ui.fragments.keylog.InterfaceInteractorKeys
import com.github.dakoyaki.dash.ui.fragments.keylog.InterfaceViewKeys
import com.github.dakoyaki.dash.ui.fragments.maps.InteractorMaps
import com.github.dakoyaki.dash.ui.fragments.maps.InterfaceInteractorMaps
import com.github.dakoyaki.dash.ui.fragments.maps.InterfaceViewMaps
import com.github.dakoyaki.dash.ui.fragments.message.InteractorMessage
import com.github.dakoyaki.dash.ui.fragments.message.InterfaceInteractorMessage
import com.github.dakoyaki.dash.ui.fragments.message.InterfaceViewMessage
import com.github.dakoyaki.dash.ui.fragments.notifications.InteractorNotifyMessage
import com.github.dakoyaki.dash.ui.fragments.notifications.InterfaceInteractorNotifyMessage
import com.github.dakoyaki.dash.ui.fragments.notifications.InterfaceViewNotifyMessage
import com.github.dakoyaki.dash.ui.fragments.recording.InteractorRecording
import com.github.dakoyaki.dash.ui.fragments.recording.InterfaceInteractorRecording
import com.github.dakoyaki.dash.ui.fragments.recording.InterfaceViewRecording
import com.github.dakoyaki.dash.ui.fragments.social.InteractorSocial
import com.github.dakoyaki.dash.ui.fragments.social.InterfaceInteractorSocial
import com.github.dakoyaki.dash.ui.fragments.social.InterfaceViewSocial
import com.google.android.gms.maps.SupportMapFragment
import dagger.Module
import dagger.Provides

/**
 * Created by dakoyaki on 15/12/20.
 */
@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    fun provideContext(): Context = activity.applicationContext

    @Provides
    fun provideActivity(): AppCompatActivity = activity

    @Provides
    fun provideSupportFragmentManager(): FragmentManager = activity.supportFragmentManager

    @Provides
    fun provideSupportMapFragment(): SupportMapFragment = SupportMapFragment.newInstance()

    @Provides
    fun provideLayoutManager(context: Context): LinearLayoutManager = LinearLayoutManager(context)

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMain(interactorParent: InteractorMainParent<InterfaceViewMainParent>): InterfaceInteractorMainParent<InterfaceViewMainParent> = interactorParent

    @Provides
    @PerActivity
    fun provideInterfaceInteractorLogin(interactor: InteractorLogin<InterfaceViewLogin>): InterfaceInteractorLogin<InterfaceViewLogin> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorRegister(interactor: InteractorRegister<InterfaceViewRegister>): InterfaceInteractorRegister<InterfaceViewRegister> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMaps(interactor: InteractorMaps<InterfaceViewMaps>): InterfaceInteractorMaps<InterfaceViewMaps> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorCalls(interactor: InteractorCalls<InterfaceViewCalls>): InterfaceInteractorCalls<InterfaceViewCalls> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorKeys(interactor: InteractorKeys<InterfaceViewKeys>): InterfaceInteractorKeys<InterfaceViewKeys> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMessage(interactor: InteractorMessage<InterfaceViewMessage>): InterfaceInteractorMessage<InterfaceViewMessage> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorPhoto(interactor: InteractorPhoto<InterfaceViewPhoto>): InterfaceInteractorPhoto<InterfaceViewPhoto> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorSocial(interactor: InteractorSocial<InterfaceViewSocial>): InterfaceInteractorSocial<InterfaceViewSocial> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorRecording(interactor: InteractorRecording<InterfaceViewRecording>): InterfaceInteractorRecording<InterfaceViewRecording> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorNotify(interactor: InteractorNotifyMessage<InterfaceViewNotifyMessage>): InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage> = interactor


}