package com.mapsa.thymeleaf.model;

import javax.persistence.*;

@Entity
public class User extends BaseEntity<Long> {

    @Column(nullable = true)
    private String name;
    @Column(length = 30, nullable = false)
    private String password;
    @Column(length = 30, nullable = false, unique = true)
    private String email;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
