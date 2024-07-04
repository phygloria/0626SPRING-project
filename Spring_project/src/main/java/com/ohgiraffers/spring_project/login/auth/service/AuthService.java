package com.ohgiraffers.spring_project.login.auth.service;

import com.ohgiraffers.spring_project.login.auth.model.AuthDetails;
import com.ohgiraffers.spring_project.login.user.model.entity.User;
import com.ohgiraffers.spring_project.login.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Objects;

public class AuthService implements UserDetailsService {
    private final UserService userService;

    @Autowired

    public AuthService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUserId(username);

        if (Objects.isNull(user)){
            throw new UsernameNotFoundException("회원정보가 존재하지 않음");
        }
        return new AuthDetails(user);
    }
}
