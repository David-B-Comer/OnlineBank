package com.userFront.userFront.domain;

import java.util.List;

public class User {

    private Long userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private boolean enabled = true;

    private PrimaryAccount primaryAccount;

    private SavingsAccount savingsAccount;

    private List<Appointment> appointmentList;

    private List<Recipient> recipientList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
