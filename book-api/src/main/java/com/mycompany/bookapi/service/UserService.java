package com.mycompany.bookapi.service;

import com.mycompany.bookapi.exception.UserNotFoundException;
import com.mycompany.bookapi.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getUsers();

    Optional<User> getUserByUsername(String username);

    User validateAndGetUserByUsername(String username) throws UserNotFoundException;

    User saveUser(User user);

    void deleteUser(User user);

}
