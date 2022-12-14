package com.loanlendingmanagementsystem.controller;

import com.loanlendingmanagementsystem.model.User;
import com.loanlendingmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/user")
    public ResponseEntity<List<User>> findAllListResponseEntity(){
        return new ResponseEntity<>(userService.findall(), HttpStatus.OK);
    }
    @PostMapping("/user/save")
    public ResponseEntity<User> saveUserResponseEntity(@RequestBody User user){
        userService.saveUser(user);
        return  new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
