package com.tirmizee.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tirmizee.entities.User;
import com.tirmizee.repositories.UserRepository;

@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired
	private UserRepository UserRepository; 
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
    public List<User> listUser(OAuth2Authentication authentication){
		System.out.println(authentication.getName());
		System.out.println(authentication.getAuthorities().size());
        return UserRepository.findAll();
    }
	
}
