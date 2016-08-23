package com.willmin.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willmin.springboot.mapper.UserMapper;
import com.willmin.springboot.model.User;
import com.willmin.springboot.service.UserService;

/**
 * 
 * @author WLM
 * @date 2016年7月1日
 */
@Service("UserService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

	@Override
	public List<User> getAllUser(){
        List<User> users = userMapper.selectAll();
        return users;
    }
	@Override
	public List<User> getAllByXml(){
        List<User> users = userMapper.findAll();
        return users;
    }
	/*@Override
    public User getUserById(String id){
    	User user  = userMapper.selectOne(arg0);
    	return user;
    }
*/
    
}
