package com.marito.rappitest.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.marito.rappitest.repositories.MovieRepository
import com.marito.rappitest.repositories.VideoRepository

class MovieDetailFactory(
    private val videoRepository: VideoRepository,
    private val movieRepository: MovieRepository,
    private val movieId: Int
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieDetailViewModel::class.java))
            return MovieDetailViewModel(videoRepository, movieRepository, movieId) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}