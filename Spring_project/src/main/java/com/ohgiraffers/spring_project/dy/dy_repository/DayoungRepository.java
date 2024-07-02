package com.ohgiraffers.spring_project.dy.dy_repository;


import com.ohgiraffers.spring_project.dy.dy_model.dy_entity.DayoungEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayoungRepository extends JpaRepository<DayoungEntity, Long> {
}
