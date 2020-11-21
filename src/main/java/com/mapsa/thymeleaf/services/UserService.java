package com.mapsa.thymeleaf.services;

import com.mapsa.thymeleaf.model.User;

import java.util.Collection;

public interface UserService {

    public void saveUser(User user);
    public Collection<User> getAllUsers();
    public void deleteUser(User user);
}
