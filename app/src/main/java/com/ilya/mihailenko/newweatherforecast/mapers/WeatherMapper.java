package com.ilya.mihailenko.newweatherforecast.mapers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.ilya.mihailenko.newweatherforecast.models.weather.Forecast;
import com.ilya.mihailenko.newweatherforecast.models.weather.Weather;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.TypeRef;

import java.lang.reflect.Type;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Ilya Mihailenko on 22/06/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 22/06/2018.
 */
@Singleton
public class WeatherMapper implements JsonDeserializer<Weather> {

    private final Configuration configuration;
    private final TypeRef<List<Forecast>> listForecastType;

    @Inject
    public WeatherMapper(Configuration configuration) {
        this.configuration = configuration;
        listForecastType = new TypeRef<List<Forecast>>() {
        };
    }

    @Override
    public Weather deserialize(JsonElement jsonElement,
                               Type typeOfT,
                               JsonDeserializationContext context) throws JsonParseException {
        final String json = jsonElement.toString();
        final Weather weather = new Weather();

        List<Forecast> forecasts = JsonPath
                .using(configuration)
                .parse(json)
                .read("$..simpleforecast.forecastday[0:7]", listForecastType);
        weather.setForecasts(forecasts);

        return weather;
    }
}
