package com.ohgiraffers.spring_project.mj.mj_service;

import com.ohgiraffers.spring_project.mj.mj_repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeService {
    private CodeRepository codeRepository;

    @Autowired
    public CodeService(CodeRepository codeRepository) {
        this.codeRepository = codeRepository;

    }


}
