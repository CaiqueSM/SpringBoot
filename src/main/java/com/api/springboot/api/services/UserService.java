package com.api.springboot.api.services;

import com.api.springboot.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
