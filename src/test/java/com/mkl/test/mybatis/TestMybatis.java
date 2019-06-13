package com.mkl.test.mybatis;

import com.mkl.mybatis.dao.UserDao;
import com.mkl.mybatis.entity.User;
import com.mkl.mybatis.mapper.UserMapper;
import com.mkl.mybatis.service.UserService;
import com.mkl.mybatis.service.serviceImpl.UserServiceImpl;
import com.mkl.test.base.UnitTestBase;
import org.junit.Test;

import java.util.List;

public class TestMybatis extends UnitTestBase {

    public TestMybatis() {
        super("classpath:spring-mybatis.xml");
    }

    @Test
    public void testMybatis() {
        UserDao userDaoI = super.getBean("userDao");
        List<User> list = userDaoI.selectUser();
        for (User user : list)
            System.out.println(user);
    }

    @Test
    public void testMybatisDaoSupport() {
        UserDao userDaoI2 = super.getBean("userDao2");
        List<User> list = userDaoI2.selectUser();
        for (User user : list)
            System.out.println(user);
    }

    @Test
    public void testMybatisMapper() {
        UserService userService = super.getBean("userService");
        System.out.println(userService.selectById(1));
    }
}
