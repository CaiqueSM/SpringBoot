package com.api.springboot.api.services;

import com.api.springboot.api.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
}
