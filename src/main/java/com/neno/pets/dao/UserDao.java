package com.neno.pets.dao;

import java.util.List;

import com.neno.pets.model.User;

public interface UserDao {
    List<User> getAll();
    User find(String id);
    int insert(User user);
    int delete(String id);
    int update(User user);
}
