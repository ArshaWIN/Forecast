package com.ilya.mihailenko.newweatherforecast;

import android.app.Activity;
import android.app.Application;

import com.ilya.mihailenko.newweatherforecast.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by Ilya Mihailenko on 27/05/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 27/05/2018.
 */
public class ForecastApp extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().create(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}
