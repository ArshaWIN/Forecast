package com.ilya.mihailenko.newweatherforecast.models.weather;

import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName("kph")
    private String speed;

    public String getSpeed() {
        return speed;
    }
}
