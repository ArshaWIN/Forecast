package com.ilya.mihailenko.newweatherforecast.di.main;

import com.ilya.mihailenko.newweatherforecast.MainActivity;
import com.ilya.mihailenko.newweatherforecast.di.ActivityComponent;
import com.ilya.mihailenko.newweatherforecast.di.ActivityComponentBuilder;

import dagger.Subcomponent;

/**
 * Created by Ilya Mihailenko on 03/06/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 03/06/2018.
 */

@MainActivityScope
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends ActivityComponent<MainActivity> {

    @Subcomponent.Builder
    interface Builder extends ActivityComponentBuilder<MainActivityComponent, MainActivityModule> {

    }
}
