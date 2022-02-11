package com.ilya.mihailenko.newweatherforecast.di;

import android.content.Context;
import android.net.ConnectivityManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ilya.mihailenko.newweatherforecast.BuildConfig;
import com.ilya.mihailenko.newweatherforecast.data.network.interceptors.NoNetworkErrorInterceptor;
import com.ilya.mihailenko.newweatherforecast.data.network.interceptors.QueryInterceptor;
import com.ilya.mihailenko.newweatherforecast.mapers.WeatherMapper;
import com.ilya.mihailenko.newweatherforecast.data.network.places.GooglePlacesApiConstans;
import com.ilya.mihailenko.newweatherforecast.models.weather.Weather;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.spi.json.GsonJsonProvider;
import com.jayway.jsonpath.spi.mapper.GsonMappingProvider;

import java.util.HashMap;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by Ilya Mihailenko on 22/06/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 22/06/2018.
 */

@Module
abstract class RestModule {

    @Singleton
    @Provides
    static ConnectivityManager provideConnectivityManager(@AppContext Context context) {
        return (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    @Singleton
    @Provides
    static HttpLoggingInterceptor provideLoggingInterceptor() {
        HttpLoggingInterceptor.Level logLevel = BuildConfig.DEBUG
                ? HttpLoggingInterceptor.Level.BODY
                : HttpLoggingInterceptor.Level.NONE;

        return new HttpLoggingInterceptor().setLevel(logLevel);
    }

    @Singleton
    @Binds
    abstract NoNetworkErrorInterceptor provideNoNetworkErrorInterceptor(NoNetworkErrorInterceptor noNetworkErrorInterceptor);

    @Provides
    @Singleton
    static Configuration provideGsonConfiguration() {
        return Configuration.builder()
                .mappingProvider(new GsonMappingProvider())
                .jsonProvider(new GsonJsonProvider())
                .build();
    }

    @Singleton
    @Provides
    static QueryInterceptor provideQueryInterceptor() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(GooglePlacesApiConstans.GOOGLE_API_KEY, GooglePlacesApiConstans.GOOGLE_API_KEY_VALUE);
        hashMap.put(GooglePlacesApiConstans.TYPE_NAME, GooglePlacesApiConstans.TYPE_VALUE_CITIES);

        return new QueryInterceptor(hashMap);
    }


    @Singleton
    @Provides
    static Gson provideGson(WeatherMapper weatherMapper) {
        return new GsonBuilder()
                .registerTypeAdapter(Weather.class, weatherMapper)
//                .registerTypeAdapter(Place.class, placesMapper)
                .create();
    }
}
