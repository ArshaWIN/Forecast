package com.ilya.mihailenko.newweatherforecast.data.network.places;


import com.ilya.mihailenko.newweatherforecast.models.places.Place;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GooglePlacesApi {
    @GET(GooglePlacesApiConstans.Route.PLACE)
    Single<Place> getCitiesSuggestions(@Query("input") String city);
}
