package com.ilya.mihailenko.newweatherforecast.models.weather;

import com.google.gson.annotations.SerializedName;


public class Temperature {
    @SerializedName("celsius")
    private String temperature;

    public String getTemperature() {
        return temperature;
    }
}
