package com.ilya.mihailenko.newweatherforecast.models.places;

import java.util.List;


public class Place {
    private List<String> suggestions;

    public List<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }
}
