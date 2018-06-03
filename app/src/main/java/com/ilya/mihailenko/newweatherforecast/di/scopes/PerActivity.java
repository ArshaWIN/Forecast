package com.ilya.mihailenko.newweatherforecast.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Ilya Mihailenko on 31/05/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 31/05/2018.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
