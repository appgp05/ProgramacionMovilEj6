package com.example.programacionmovilej6.movies_api;

import android.telecom.Call;

import com.example.programacionmovilej6.json_maper.MovieResponse;

public class MoviesAPI {
    @GET("movie/popular?api_key=61e0d26ead78a0b630a6ffe401e15a6a");
    Call<MovieResponse> getPopularMovies();
}
