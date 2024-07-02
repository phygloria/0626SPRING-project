package com.ohgiraffers.spring_project.mj.mj_repository;

import com.ohgiraffers.spring_project.mj.mj_model.mj_entity.CodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CodeRepository extends JpaRepository<CodeEntity, Integer> {



}
