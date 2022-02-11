package com.ilya.mihailenko.newweatherforecast;

import com.ilya.mihailenko.newweatherforecast.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by Ilya Mihailenko on 27/05/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 27/05/2018.
 */
public class ForecastApp extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }

}
