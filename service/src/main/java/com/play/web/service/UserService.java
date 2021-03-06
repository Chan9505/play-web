package com.play.web.service;

/**
 * Created by admin on 16/8/8.
 */

import com.play.web.bean.User;
import com.play.web.dao.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created with IntelliJ IDEA.
 * User: caizhuojie
 * Date: 2017/7/25
 * Time: 15:12
 * To change this template use File | Settings | File Templates.
 */


/**
 * 用户服务接口
 *
 */
@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
   @Autowired
   private UserMapper userMapper;


    @Transactional
    public User loadUserByUsername(String username) {
        return userMapper.loadUserByUsername(username);
    }

    @Transactional
    public void saveUser(User user) {
        userMapper.saveUser(user);
//        测试异常后数据是否回滚
//        getError();
    }

    private void getError() {
        int i = 1 / 0;
        logger.info("i:{}" , i);
    }
}
