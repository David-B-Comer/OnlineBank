package com.userFront.userFront.service;

import com.userFront.userFront.domain.PrimaryAccount;
import com.userFront.userFront.domain.SavingsAccount;

public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();
}
