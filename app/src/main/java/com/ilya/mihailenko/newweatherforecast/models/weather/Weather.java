package com.ilya.mihailenko.newweatherforecast.models.weather;

import java.util.List;

public class Weather {
    private String city;
    private List<Forecast> forecasts;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }
}
