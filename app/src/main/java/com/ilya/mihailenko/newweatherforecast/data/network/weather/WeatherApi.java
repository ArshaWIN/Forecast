package com.ilya.mihailenko.newweatherforecast.data.network.weather;

import com.ilya.mihailenko.newweatherforecast.models.weather.Weather;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Ilya on 11.06.2017.
 */

public interface WeatherApi {

    @GET(WeatherApiConstans.Route.FORECAST_FOR_CITY)
    Single<Weather> getWeather(@Path("city") String city);
}
