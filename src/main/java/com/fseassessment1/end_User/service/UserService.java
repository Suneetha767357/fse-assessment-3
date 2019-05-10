package com.fseassessment1.end_User.service;

import com.fseassessment1.end_User.model.UserModel;
import com.fseassessment1.end_User.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepo userRepo;
    private List<UserModel> modelList = new ArrayList<>();
    UserModel userModel;

    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public UserModel saveUserAction(UserModel userModel) {

        userRepo.save(userModel);

        return userModel;
    }

     public List<UserModel> getUserList(){
        return modelList;
    }

    public UserModel getById(Integer id) {
        return userRepo.findByUserId(id);
    }


    public UserModel getUserById(Integer id) {
        return userModel;
    }
}
