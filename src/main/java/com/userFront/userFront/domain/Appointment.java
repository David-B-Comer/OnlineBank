package com.userFront.userFront.domain;

import java.util.Date;

public class Appointment {

    private Long id;
    private Date date;
    private String location;
    private String description;
    private boolean confirmed;
    private User user;

}