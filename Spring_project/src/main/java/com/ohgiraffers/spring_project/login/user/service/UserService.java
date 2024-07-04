package com.ohgiraffers.spring_project.login.user.service;

import com.ohgiraffers.spring_project.login.user.dao.UserRepository;
import com.ohgiraffers.spring_project.login.user.model.dto.SignupDTO;
import com.ohgiraffers.spring_project.login.user.model.dto.UserRole;
import com.ohgiraffers.spring_project.login.user.model.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

    private final PasswordEncoder encoder;
    private final UserRepository userRepository;


    @Autowired
    public UserService(PasswordEncoder encoder, UserRepository userRepository) {
        this.encoder = encoder;
        this.userRepository = userRepository;
    }

    //애매
    @Transactional
    public Integer regist(SignupDTO signupDTO){
        User user = userRepository.findByuserId(signupDTO.getUserId());

        if (!Objects.isNull(user)){
            return null;
        }

        user = new User();
        user.setUserId(signupDTO.getUserId());
        user.setUserName(signupDTO.getUserName());
        user.setUserRole(UserRole.valueOf(signupDTO.getRole()));
        user.setPassword(encoder.encode(signupDTO.getPassword()));

        User savedUser = userRepository.save(user);

        if (Objects.isNull(savedUser)){
            return 0;
        }else {
            return 1;
        }
    }

    public User findByUserId(String username){

        User user = userRepository.findByuserId(username);
        if (Objects.isNull(user)){
            return null;
        }
        return user;
    }

}
