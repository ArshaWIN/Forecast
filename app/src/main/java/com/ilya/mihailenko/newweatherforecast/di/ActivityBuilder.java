package com.ilya.mihailenko.newweatherforecast.di;

import com.ilya.mihailenko.newweatherforecast.di.scopes.PerActivity;
import com.ilya.mihailenko.newweatherforecast.ui.view.main.MainActivity;
import com.ilya.mihailenko.newweatherforecast.di.main.MainActivityModule;
import com.ilya.mihailenko.newweatherforecast.di.testfragment.TestFragmentProvider;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Ilya Mihailenko on 03/06/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 03/06/2018.
 */

@Module
abstract class ActivityBuilder {

    @PerActivity
    @ContributesAndroidInjector(modules = {MainActivityModule.class, TestFragmentProvider.class})
    abstract MainActivity bindMainActivity();
}
