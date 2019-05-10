package com.fseassessment1.end_User.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserModel {

    @Id
    public int id;

    public String context;

    public Date timeStamp;

    public UserModel(){

    }

    public UserModel(int id , String context , Date timestamp){
        this.id = id;
        this.context = context;
        this.timeStamp = timeStamp;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getTimestamp() {
        return timeStamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timeStamp = timestamp;
    }


}
