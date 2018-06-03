package com.ilya.mihailenko.newweatherforecast.di;

import android.app.Application;
import android.content.Context;

import com.ilya.mihailenko.newweatherforecast.di.main.MainActivityComponent;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Ilya Mihailenko on 31/05/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 31/05/2018.
 */
@Module(subcomponents = {MainActivityComponent.class})
abstract public class AppModule {

    @Singleton
    @Binds
    @AppContext
    abstract Context provideContext(Application application);

}
