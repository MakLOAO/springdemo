package com.mkl.mybatis.dao.daoImpl;

import com.mkl.mybatis.dao.UserDao;
import com.mkl.mybatis.entity.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoI implements UserDao {

    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<User> selectUser() {
        //注释掉的代码是对事务的测试，delete语句是报错的，如果insert语句不生效，则这个函数是一个事务
//        User user = new User();
//        user.setName("aha1");
//        user.setPassword("5671");
//        sqlSession.insert("com.mkl.mybatis.UserMapper.add", user);
//        sqlSession.delete("com.mkl.mybatis.UserMapper.remove", 1);
        return sqlSessionTemplate.selectList("com.mkl.mybatis.UserMapper.selectUser");
    }

    public void setSqlSession(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
}
