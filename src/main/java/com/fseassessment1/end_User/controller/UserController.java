package com.fseassessment1.end_User.controller;

import com.fseassessment1.end_User.model.UserModel;
import com.fseassessment1.end_User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private UserService userService;
    private UserModel userModel;

    @Autowired
    public UserController(UserService userService){
         this.userService = userService;
     }

     @PostMapping("postUser")
     protected UserService onStart() {

       List<UserModel> model = new ArrayList<>();
          return userService;
    }

    @GetMapping(path="/", produces = "application/json")
    public UserModel getUsers(UserModel model)
    {
        return userService.saveUserAction(model);
    }

    @GetMapping("/user/{id}")
    public UserModel findById(@PathVariable Integer id){
        return userService.getUserById(id);

    }
    }
