package com.example.io;

import java.io.Serializable;

public class User implements Serializable {

    private String email;
    private String name;
    private int birthYear;


    public User(String email, String namel, int birthYear) {
        this.email = email;
        this.name = namel;
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "User{" +
            "email='" + email + '\'' +
            ", namel='" + name + '\'' +
            ", birthYear=" + birthYear +
            '}';
    }
}