package com.ilya.mihailenko.newweatherforecast.di;

/**
 * Created by Ilya Mihailenko on 03/06/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 03/06/2018.
 */
public interface ActivityComponentBuilder<C extends ActivityComponent, M extends ActivityModule>   {
    C build();
    ActivityComponentBuilder<C,M> module(M module);
}
