package com.ilya.mihailenko.newweatherforecast.data.network.interceptors;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;

import com.ilya.mihailenko.newweatherforecast.models.errors.NoInternetConnectionError;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

public class NoNetworkErrorInterceptor implements Interceptor {
    private final ConnectivityManager connectivityManager;

    public NoNetworkErrorInterceptor(ConnectivityManager connectivityManager) {
        this.connectivityManager = connectivityManager;
    }

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        if (!isNetworkEnabled()) {
            throw new NoInternetConnectionError();
        }
        return chain.proceed(chain.request());
    }

    private boolean isNetworkEnabled() {
        final NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

}