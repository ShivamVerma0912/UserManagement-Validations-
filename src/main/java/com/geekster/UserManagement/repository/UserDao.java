package com.geekster.UserManagement.repository;

import com.geekster.UserManagement.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    private List<User> userList;

    public UserDao(List<User> userList){
        this.userList = new ArrayList<>();
    }


    public List<User> getUserList() {
        return this.userList;
    }

    public boolean add(User user) {
        userList.add(user);
        return true;
    }
    public boolean remove(User user){
        userList.remove(user);
        return true;
    }
}
