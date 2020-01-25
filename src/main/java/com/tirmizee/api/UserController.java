package com.tirmizee.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tirmizee.api.data.UserData;
import com.tirmizee.dao.UserDao;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
    public List<UserData> listUser(){
        return userDao.findAll();
    }
	
}
