package com.fseassessment1.end_User.repository;

import com.fseassessment1.end_User.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel , String> {

     UserModel findByUserId(int id);

}
