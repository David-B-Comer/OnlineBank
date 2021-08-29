package com.userFront.userFront.domain;

public class Recipient {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String accountNumber;
    private String description;
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
