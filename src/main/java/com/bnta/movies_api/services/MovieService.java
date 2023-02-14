package com.bnta.movies_api.services;

import com.bnta.movies_api.models.Movie;
import com.bnta.movies_api.repositiories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
    public Movie getMovieById(long id){
        return movieRepository.findById(id).get();
    }

    //chatGPT did this
    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }








}
