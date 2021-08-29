package com.userFront.userFront.domain;

import java.math.BigDecimal;
import java.util.List;

public class PrimaryAccount {

    private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;

    private List<PrimaryTransaction> primaryTransactionList;
}
