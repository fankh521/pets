package com.neno.pets.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.neno.pets.dao.UserDao;
import com.neno.pets.model.User;
import com.neno.pets.service.UserService;



@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int delete(String id) {
        return userDao.delete(id);
    }

    @Override
    public int update(User user) {
        User userOutVo=null;
        if(user!=null && !StringUtils.isEmpty(user.getId())) {
            userOutVo=userDao.find(user.getId());
            if(userOutVo!=null) {
                LOGGER.info("名字："+user.getName());
                userOutVo.setName(user.getName());
                userOutVo.setBreed(user.getBreed());
                userOutVo.setSex(user.getSex());
                userOutVo.setAge(user.getAge());
                userOutVo.setD_id(user.getD_id());
            }
        }
        return userDao.update(userOutVo);
    }

    @Override
    public User find(String id) {
        return userDao.find(id);
    }
}