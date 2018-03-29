package com.mahadi.service;

import com.mahadi.dao.User;
import com.mahadi.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by Mahadi on 11/2/2017.
 */
@Component("userService")
public class UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void create(User user){
        userDao.create(user);
    }

    public boolean exits(String username){

       return userDao.exits(username);
    }

   // @Secured("ROLE_ADMIN")
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
