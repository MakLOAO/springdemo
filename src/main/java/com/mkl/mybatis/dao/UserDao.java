package com.mkl.mybatis.dao;

import com.mkl.mybatis.entity.User;

import java.util.List;

public interface UserDao {

    public List<User> selectUser();
}
