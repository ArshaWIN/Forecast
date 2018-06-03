package com.ilya.mihailenko.newweatherforecast.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by Ilya Mihailenko on 31/05/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 31/05/2018.
 */
@Singleton
@Component(modules = {AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    void injectComponentsHolder(ComponentsHolder componentsHolder);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
