package com.ilya.mihailenko.newweatherforecast.di.testfragment;

import com.ilya.mihailenko.newweatherforecast.TestFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Ilya Mihailenko on 09/06/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 09/06/2018.
 */

@Module
public abstract class TestFragmentProvider {
    @ContributesAndroidInjector(modules = TestFragmentModule.class)
    abstract TestFragment provideDetailFragmentFactory();
}
