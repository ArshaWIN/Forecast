package com.ilya.mihailenko.newweatherforecast.data.network.weather;

import com.google.gson.Gson;
import com.ilya.mihailenko.newweatherforecast.BuildConfig;
import com.ilya.mihailenko.newweatherforecast.data.network.interceptors.NoNetworkErrorInterceptor;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


@Singleton
public class WeatherNetworkService implements WeatherApiProvider {
    private static final String BASE_URL = BuildConfig.SERVER_URL;

    private WeatherApi weatherApi;

    private static final long NETWORK_TIMEOUT_SECONDS = 30;

    @Inject
    public WeatherNetworkService(HttpLoggingInterceptor loggingInterceptor,
                                 NoNetworkErrorInterceptor networkErrorInterceptor,
                                 Gson gson) {


        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .addInterceptor(networkErrorInterceptor)
                .connectTimeout(NETWORK_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                .readTimeout(NETWORK_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                .writeTimeout(NETWORK_TIMEOUT_SECONDS, TimeUnit.SECONDS);

        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl(getUrlWithKey())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()));


        weatherApi = retrofitBuilder
                .client(okHttpClientBuilder.build())
                .build()
                .create(WeatherApi.class);

    }

    private String getUrlWithKey() {
        return BASE_URL + WeatherApiConstans.WEATHER_API_KEY + "/";
    }


    @Override
    public WeatherApi getWeatherApi() {
        return weatherApi;
    }

}
