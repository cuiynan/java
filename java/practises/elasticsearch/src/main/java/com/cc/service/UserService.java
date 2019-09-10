package com.cc.service;

import com.cui.entity.User;

import java.util.List;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/25 18:13
 **/
public interface UserService {

    void saveUser(User user);

    boolean deleteById(User user);

    void updateUserById(User user);

    User findById(User user);

    List<User> findAll();

    List<User> findByIdAndName(User user);
}
