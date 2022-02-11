package com.ilya.mihailenko.newweatherforecast.data.network.places;


public class GooglePlacesApiConstans {

    // places api
    public static final String GOOGLE_API_BASE_URL = "https://maps.googleapis.com/";

    public static final String GOOGLE_API_KEY = "key";
    public static final String GOOGLE_API_KEY_VALUE = "AIzaSyBGMCvcCZLgG6J1GEOxrfPu2ElpKN2aInc";
    public static final String TYPE_NAME = "types";
    public static final String TYPE_VALUE_CITIES = "(cities)";

    final static class Route {
        static final String PLACE = "maps/api/place/autocomplete/json";
    }

}
