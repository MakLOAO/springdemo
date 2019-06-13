package com.mkl.mybatis.service;

import com.mkl.mybatis.entity.User;

import java.util.List;


public interface UserService {

    List<User> selectAll();
    User selectById(int id);
}
