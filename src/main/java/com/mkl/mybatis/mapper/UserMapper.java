package com.mkl.mybatis.mapper;

import com.mkl.mybatis.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

    User selectById(int id);
}
