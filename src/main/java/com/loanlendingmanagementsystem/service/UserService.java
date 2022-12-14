package com.loanlendingmanagementsystem.service;

import com.loanlendingmanagementsystem.model.User;
import com.loanlendingmanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void saveUser(User user){
        userRepository.save(user);
    }
    public List<User>findall(){
       return userRepository.findAll();
    }
}
