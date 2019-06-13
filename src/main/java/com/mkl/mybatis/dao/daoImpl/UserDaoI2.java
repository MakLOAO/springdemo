package com.mkl.mybatis.dao.daoImpl;

import com.mkl.mybatis.dao.UserDao;
import com.mkl.mybatis.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

public class UserDaoI2 extends SqlSessionDaoSupport implements UserDao {

    @Override
    public List<User> selectUser() {
        return getSqlSession().selectList("com.mkl.mybatis.UserMapper.selectUser");
    }
}
