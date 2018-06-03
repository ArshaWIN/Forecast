package com.ilya.mihailenko.newweatherforecast.di;

/**
 * Created by Ilya Mihailenko on 03/06/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 03/06/2018.
 */
public interface ActivityComponent<A> {
    void inject(A activity);
}