package com.cc.service.impl;

import com.cui.entity.User;
import com.cc.reponsitory.UserReponsitory;
import com.cc.service.UserService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * @Descriptionx
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/25 18:16
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserReponsitory userReponsitory;

    @Override
    public void saveUser(User user) {
        userReponsitory.save(user);
    }

    @Override
    public boolean deleteById(User user) {
        userReponsitory.deleteById(user.getId());
        return false;
    }

    @Override
    public void updateUserById(User user) {
        userReponsitory.save(user);
    }

    @Override
    public User findById(User user) {
        Optional<User> optionalUser = userReponsitory.findById(user.getId());
        User entity = optionalUser.get();
        return entity;
    }

    @Override
    public List<User> findAll() {
        Iterable<User> iterable = userReponsitory.findAll();
        return Lists.newArrayList(iterable);
    }

    @Override
    public List<User> findByIdAndName(User user) {
        Iterable<User> iterable = userReponsitory.findByIdAndName(user.getId(),user.getUserName(),PageRequest.of(0,10));
        return Lists.newArrayList(iterable);
    }


}
