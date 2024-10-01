package com.example.programacionmovilej6.json_maper;

import java.util.List;

public class MovieResponse {
    private List<Movie> results;

    private List<Movie> getResults(){
        return results;
    }
    public void setResults(List<Movie> results) {
        this.results = results;
    }
}
