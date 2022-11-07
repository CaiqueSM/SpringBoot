package com.api.springboot.api.services;

import com.api.springboot.api.Repository.UserRepository;
import com.api.springboot.api.domain.User;
import com.api.springboot.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado."));
    }

    public List<User> findAll(){
        return repository.findAll();
    }
}
