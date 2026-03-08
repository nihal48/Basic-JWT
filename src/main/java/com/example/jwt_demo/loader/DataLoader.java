package com.example.jwt_demo.loader;

import com.example.jwt_demo.entity.User;
import com.example.jwt_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User(null, "nick", "{noop}1234", "USER"));
        userRepository.save(new User(null, "admin", "{noop}admin123", "ADMIN"));
        userRepository.save(new User(null, "john", "{noop}pass123", "USER"));

        System.out.println("✅ Dummy data inserted!");
    }
}
