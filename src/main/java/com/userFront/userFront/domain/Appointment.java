package com.userFront.userFront.domain;

import java.util.Date;

public class Appointment {

    private Long id;
    private Date date;
    private String location;
    private String description;
    private boolean confirmed;
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }
}
