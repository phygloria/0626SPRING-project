package com.ohgiraffers.spring_project.sy.service;

import com.ohgiraffers.spring_project.sy.repository.MovieRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
//    private MovieRepository movieRepository;
//
//    public MovieService(MovieRepository movieRepository) {
//        this.movieRepository = movieRepository;
//
//    }


    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Page<MovieEntity> getMoviesByPage(int pageNumber, int pageSize) {
        return movieRepository.findAll(PageRequest.of(pageNumber, pageSize));
    }

}
