package com.tirmizee.config.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tirmizee.entities.User;
import com.tirmizee.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		
		User user = userRepository.findByUsername(userId);
	
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		
		return new UserDetailsImpl.Builder()
			.username(user.getUsername())
			.password(user.getPassword())
			.accountNonExpired(true)
			.accountNonLocked(true)
			.enabled(true)
			.credentialsNonExpired(true)
			.authorities(grantAuthorities(user.getPermissions()))
			.build();
	}

	private Set<GrantedAuthority> grantAuthorities(Collection<? extends com.tirmizee.entities.Permission> permissions){
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        permissions.forEach(o -> authorities.add(new SimpleGrantedAuthority(o.getPerCode())));
        return authorities;
	}
	
}
