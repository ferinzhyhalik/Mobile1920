package com.github.ferinzhyhalik.week08_movieTracker.moviedetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.ferinzhyhalik.week08_movieTracker.database.MovieDatabaseDao

class MovieDetailsViewModelFactory (
    private val movieKey: Long,
    private val dataSource: MovieDatabaseDao) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieDetailsViewModel::class.java)) {
            return MovieDetailsViewModel(movieKey, dataSource) as T
        }
        throw IllegalAccessException("ViewModel class not recognized.")
    }

}