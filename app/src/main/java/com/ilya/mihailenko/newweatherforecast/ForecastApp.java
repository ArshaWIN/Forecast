package com.ilya.mihailenko.newweatherforecast;

import android.app.Application;
import android.content.Context;

import com.ilya.mihailenko.newweatherforecast.di.ComponentsHolder;

/**
 * Created by Ilya Mihailenko on 27/05/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 27/05/2018.
 */
public class ForecastApp extends Application  {

    private ComponentsHolder componentsHolder;

    public static ForecastApp getApp(Context context) {
        return (ForecastApp)context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        componentsHolder = new ComponentsHolder(this);
        componentsHolder.init();
    }

    public ComponentsHolder getComponentsHolder() {
        return componentsHolder;
    }

}
