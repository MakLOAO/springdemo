package com.mkl.mybatis.service.serviceImpl;

import com.mkl.mybatis.entity.User;
import com.mkl.mybatis.mapper.UserMapper;
import com.mkl.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User selectById(int id) {
        return userMapper.selectById(id);
    }
}
