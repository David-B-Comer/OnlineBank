package com.userFront.userFront.domain;

import java.math.BigDecimal;
import java.util.Date;

public class PrimaryTransaction {

    private Long id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private BigDecimal availableBalance;
    private PrimaryAccount primaryAccount;

    public PrimaryTransaction() {
    }

}
