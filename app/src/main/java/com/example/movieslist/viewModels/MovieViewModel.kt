package com.example.movieslist.viewModels

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieslist.models.Movie
import com.example.movieslist.network.RetrofitInterface
import kotlinx.coroutines.launch

class MovieViewModel:ViewModel() {

    var moviesList : List<Movie> by mutableStateOf(listOf())

    fun getAllMovies(){

        viewModelScope.launch{

            try {

                val response = RetrofitInterface.apiInterface.getAllMovies()

                moviesList = response.body()!!

            } catch (e: Exception) {

                Log.d("error message",e.message!!)

            }

        }

    }
}