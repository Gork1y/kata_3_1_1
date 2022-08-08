package com.gorkiy.kata_3_1_1.Service;

import java.util.List;

import com.gorkiy.kata_3_1_1.model.User;

public interface UserService {
    List<User> getAllUsers();
    User add(User user);
    void delete(Long id);
    User getById(Long id);
}
