package com.ohgiraffers.spring_project.hy.service;

import com.ohgiraffers.spring_project.hy.repository.Hy_MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class Hy_MovieService {

    private Hy_MovieRepository hyMovieRepository;

    public Hy_MovieService(Hy_MovieRepository hyMovieRepository) {
        this.hyMovieRepository = hyMovieRepository;
        System.out.println("PHY");
    }

}
