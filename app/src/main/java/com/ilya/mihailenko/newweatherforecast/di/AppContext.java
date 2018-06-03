package com.ilya.mihailenko.newweatherforecast.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Ilya Mihailenko on 08/02/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 08/02/2018.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface AppContext {
}
