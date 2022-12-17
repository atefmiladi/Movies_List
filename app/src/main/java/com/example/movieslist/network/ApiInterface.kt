package com.example.movieslist.network

import com.example.movieslist.models.Movie
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("/movielist.json")
    suspend fun getAllMovies(): Response<List<Movie>>
}