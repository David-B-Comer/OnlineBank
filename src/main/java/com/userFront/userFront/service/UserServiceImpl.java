package com.userFront.userFront.service;

import com.userFront.userFront.dao.UserDao;
import com.userFront.userFront.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public void save(User user) {
        userDao.save(user);
    }


}
