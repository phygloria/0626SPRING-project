package com.ohgiraffers.spring_project.jh.jh_repository;


import com.ohgiraffers.spring_project.jh.jh_model.jh_entity.JaeheeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JaeheeRepository extends JpaRepository<JaeheeEntity, Integer> {
}
