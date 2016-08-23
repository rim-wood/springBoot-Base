package com.willmin.springboot.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.willmin.springboot.model.User;
import com.willmin.springboot.service.UserService;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * 
 * @author WLM
 * @date 2016年7月1日
 */
@Controller
@RequestMapping(value="/user")
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    
    @ResponseBody
    @ApiOperation(value="Get all users",notes="requires noting")
    @RequestMapping(value="/getAllUser" , method=RequestMethod.GET)
    public List<User> getAllUser() {
        List<User> users = userService.getAllUser();
        if(users.size()>0){
        	for(User user : users){
        		 System.out.println("user.getName():"+user.getName());
                 logger.info("user.getAge():"+user.getAge());
        	}
        }
        return users;
    }
    
    @ResponseBody
    @ApiOperation(value="Get all users By XML",notes="requires noting")
    @RequestMapping(value="/getAllUseByXml" , method=RequestMethod.GET)
    public List<User> getAllUseByXmlr() {
        List<User> users = userService.getAllByXml();
        if(users.size()>0){
        	for(User user : users){
        		 System.out.println("user.getName():"+user.getName());
                 logger.info("user.getAge():"+user.getAge());
        	}
        }
        return users;
    }
    
    /*@ApiOperation(value="Get user with id",notes="requires the id of user")
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public User getUserById(@PathVariable String id){
        User user= userService.getUserById(id);
        return user;
    }*/
}
