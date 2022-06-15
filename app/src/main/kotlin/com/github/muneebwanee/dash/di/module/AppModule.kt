package com.github.dakoyaki.dash.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by dakoyaki on 15/12/20.
 */
@Module
class AppModule(val app : Application){

    @Provides
    fun provideContext(): Context = app.applicationContext

}