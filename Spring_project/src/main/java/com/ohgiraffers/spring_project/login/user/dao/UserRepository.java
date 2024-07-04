package com.ohgiraffers.spring_project.login.user.dao;

import com.ohgiraffers.spring_project.login.user.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    User findByuserId(String username);
}
