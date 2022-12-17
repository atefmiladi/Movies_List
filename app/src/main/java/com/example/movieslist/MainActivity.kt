package com.example.movieslist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.movieslist.models.Movie
import com.example.movieslist.ui.theme.MoviesListTheme
import com.example.movieslist.viewModels.MovieViewModel
import com.example.movieslist.views.MovieCard

class MainActivity : ComponentActivity() {

  

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun MovieList(moviesList: List<Movie>) {
    LazyColumn {
        items(moviesList) {item: Movie -> MovieCard(movie = item) }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MoviesListTheme {
        val movie = Movie(name = "Movie1", desc = "this is desc", imgUrl ="https://howtodoandroid.com/images/dunkirk.jpg", category = "Horror")
        MovieCard(movie = movie)
    }
}