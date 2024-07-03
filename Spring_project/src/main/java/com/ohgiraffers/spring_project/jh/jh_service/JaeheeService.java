package com.ohgiraffers.spring_project.jh.jh_service;


import com.ohgiraffers.spring_project.jh.jh_repository.JaeheeRepository;
import org.springframework.stereotype.Service;

@Service
public class JaeheeService {
    private JaeheeRepository jaeheeRepository;

    public JaeheeService(JaeheeRepository jaeheeRepository){
        this.jaeheeRepository = jaeheeRepository;
    }


}
