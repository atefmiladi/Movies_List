package com.example.movieslist.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.movieslist.models.Movie


@Composable
fun MovieCard(movie: Movie){

    Card(modifier = Modifier
        .fillMaxSize()
        .height(220.dp), shape = RoundedCornerShape(8.dp), elevation = 4.dp) {

        Row(modifier = Modifier
            .padding(4.dp)
            .fillMaxSize()) {

            Image(painter = rememberAsyncImagePainter(model = movie.imgUrl), contentDescription =movie.desc , modifier = Modifier
                .fillMaxSize()
                .weight(0.4f))

            Column(verticalArrangement = Arrangement.Center, modifier = Modifier
                .padding(4.dp)
                .fillMaxHeight()
                .weight(0.6f)) {

                Text(text =movie.name, style = MaterialTheme.typography.subtitle1, fontWeight = FontWeight.Bold, modifier = Modifier.padding(4.dp))
                Text(text = movie.category, style = MaterialTheme.typography.caption, fontWeight = FontWeight.Black,modifier = Modifier.padding(4.dp) )
                Text(text = movie.desc)

            }

        }
    }
    
}