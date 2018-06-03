package com.ilya.mihailenko.newweatherforecast.di;

import com.ilya.mihailenko.newweatherforecast.MainActivity;
import com.ilya.mihailenko.newweatherforecast.di.main.MainActivityComponent;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

/**
 * Created by Ilya Mihailenko on 03/06/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 03/06/2018.
 */

@Module
public class ActivityBuilder {

    @Provides
    @IntoMap
    @ClassKey(MainActivity.class)
    ActivityComponentBuilder provideFirstActivityBuilder(MainActivityComponent.Builder builder) {
        return builder;
    }
}
