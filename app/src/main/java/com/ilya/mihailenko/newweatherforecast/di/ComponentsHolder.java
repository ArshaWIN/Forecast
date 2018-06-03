package com.ilya.mihailenko.newweatherforecast.di;

import android.app.Application;
import android.content.Context;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by Ilya Mihailenko on 03/06/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 03/06/2018.
 */
public class ComponentsHolder {
    private final Application appContext;

    @Inject
    Map<Class<?>, Provider<ActivityComponentBuilder>> builders;

    private Map<Class<?>, ActivityComponent> components;
    private AppComponent appComponent;

    public ComponentsHolder(Application application) {
        this.appContext = application;
    }

    public void init() {
        appComponent = DaggerAppComponent.builder().application(appContext).build();
        appComponent.injectComponentsHolder(this);
        components = new HashMap<>();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public ActivityComponent getActivityComponent(Class<?> cls) {
        return getActivityComponent(cls, null);
    }

    @SuppressWarnings("unchecked")
    public ActivityComponent getActivityComponent(Class<?> cls, ActivityModule module) {
        ActivityComponent component = components.get(cls);
        if (component == null) {
            ActivityComponentBuilder builder = builders.get(cls).get();
            if (module != null) {
                builder.module(module);
            }
            component = builder.build();
            components.put(cls, component);
        }
        return component;
    }

    public void releaseActivityComponent(Class<?> cls) {
        components.put(cls, null);
    }
}
