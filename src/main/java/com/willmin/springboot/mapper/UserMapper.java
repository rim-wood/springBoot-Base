package com.willmin.springboot.mapper;

import java.util.List;

import com.willmin.springboot.model.User;
import com.willmin.springboot.utils.MyMapper;


/**
 * 
 * @author WLM
 * @date 2016年7月1日
 */
public interface UserMapper extends MyMapper<User>{
	List<User> findAll();
}
