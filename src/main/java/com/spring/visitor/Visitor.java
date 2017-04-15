package com.spring.visitor;

import java.util.Date;

/**
 * Created by dhavalpatel on 15/04/17.
 */
public class Visitor {
    private int id;
    private String name;
    private String email;
    private String city;
    private Date dob;
    private String gender;
    private Date date;

    public Visitor(int id, String name, String email, String city, String gender, Date dob, Date date){
        this.id = id;
        this.name = name;
        this.email = email;
        this.city = city;
        this.gender = gender;
        this.dob = dob;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public Date getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format(
                "Visitor[id=%d, name='%s', email='%s']",
                id, name, email);
    }
}
