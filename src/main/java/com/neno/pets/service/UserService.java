package com.neno.pets.service;

import java.util.List;

import com.neno.pets.model.User;

public interface UserService {
    List<User> getAll();
    int insert(User user);
    int update(User user);
	int delete(String id);
	User find(String id);

}