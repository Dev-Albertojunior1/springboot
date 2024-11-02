package com.finance.demo.service;

import com.finance.demo.dto.UserDTO;
import com.finance.demo.model.User;
import com.finance.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public User saveUser(UserDTO userDTO) {
        User user = new User();
        user.setName(user.getName());
        user.setEmail(user.getEmail());
        return userRepository.save(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }
}
