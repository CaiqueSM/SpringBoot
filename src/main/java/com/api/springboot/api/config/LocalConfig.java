package com.api.springboot.api.config;

import com.api.springboot.api.Repository.UserRepository;
import com.api.springboot.api.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        User u1 = new User(1, "caimachado", "caimachado@mail.com","123");
        User u2 = new User(2, "machado", "machado@mail.com","123");

        repository.saveAll(List.of(u1, u2));
    }
}
