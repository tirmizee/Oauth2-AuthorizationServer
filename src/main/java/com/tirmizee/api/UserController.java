package com.tirmizee.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tirmizee.api.dto.UserDTO;
import com.tirmizee.mapper.UserMapper;
import com.tirmizee.repositories.UserRepository;

@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired
	private UserRepository UserRepository; 
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
    public List<UserDTO> listUser(){
        return UserMapper.INSTANCE.toDtos(UserRepository.findAll());
    }
	
}
