package com.ilya.mihailenko.newweatherforecast.data.network.interceptors;

import android.support.annotation.NonNull;

import java.io.IOException;
import java.util.Map;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class QueryInterceptor implements Interceptor {
    private final Map<String, String> queries;

    public QueryInterceptor(Map<String, String> queries) {
        this.queries = queries;
    }

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request request = chain.request();

        final HttpUrl.Builder builder = request.url().newBuilder();

      /*  Observable.fromArray(queries.entrySet())
//                .subscribeOn(Schedulers.immediate())
                .subscribe(entry -> builder.addQueryParameter(entry.getKey(), entry.getValue()));*/

        request = request.newBuilder().url(builder.build()).build();

        return chain.proceed(request);
    }

}