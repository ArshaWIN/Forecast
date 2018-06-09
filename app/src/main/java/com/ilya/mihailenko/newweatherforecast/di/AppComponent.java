package com.ilya.mihailenko.newweatherforecast.di;

import com.ilya.mihailenko.newweatherforecast.ForecastApp;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Ilya Mihailenko on 31/05/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 31/05/2018.
 */
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<ForecastApp> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<ForecastApp> {
    }
}