package com.userFront.userFront.service.UserServiceImpl;

import com.userFront.userFront.domain.PrimaryAccount;
import com.userFront.userFront.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private PrimaryAccountDao primaryAccountDao;
}
