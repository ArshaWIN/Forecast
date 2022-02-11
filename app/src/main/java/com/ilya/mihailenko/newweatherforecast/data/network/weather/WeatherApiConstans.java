package com.ilya.mihailenko.newweatherforecast.data.network.weather;


public final class WeatherApiConstans {

    // weather api
    public static final String WEATHER_API_KEY = "2cdcb84e92cc5749";
    public static final String BASE_URL = "http://api.wunderground.com/api/";


    final static class Route {
        static final String FORECAST_FOR_CITY = "forecast10day/q/CA/{city}.json";
    }
}
