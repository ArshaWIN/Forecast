package com.ilya.mihailenko.newweatherforecast.models.weather;

import com.google.gson.annotations.SerializedName;


public class Forecast {

    @SerializedName("conditions")
    private String conditions;

    @SerializedName("high")
    private Temperature highTemperature;

    @SerializedName("low")
    private Temperature lowTemperature;

    @SerializedName("date")
    private Date date;

    @SerializedName("avehumidity")
    private String humidity;

    @SerializedName("icon_url")
    private String iconUrl;

    @SerializedName("avewind")
    private Wind wind;

    public String getConditions() {
        return conditions;
    }

    public Temperature getHighTemperature() {
        return highTemperature;
    }

    public Temperature getLowTemperature() {
        return lowTemperature;
    }

    public Date getDate() {
        return date;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public Wind getWind() {
        return wind;
    }
}
