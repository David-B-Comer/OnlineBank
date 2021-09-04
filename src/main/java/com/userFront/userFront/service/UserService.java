package com.userFront.userFront.service;

import com.userFront.userFront.domain.User;

public interface UserService {

    User findByUsername(String username);
}
