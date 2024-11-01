package com.finance.demo.service;

import com.finance.demo.dto.UserDTO;
import com.finance.demo.model.User;
import com.finance.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserDTO userDTO) {

        User user = new User(userDTO.getName(), userDTO.getEmail());
    }
}
