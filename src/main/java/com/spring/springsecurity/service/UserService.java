package com.spring.springsecurity.service;

import com.spring.springsecurity.domain.Role;
import com.spring.springsecurity.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saverRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
