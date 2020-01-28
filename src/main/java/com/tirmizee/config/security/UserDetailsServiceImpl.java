package com.tirmizee.config.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tirmizee.dao.PermissionDao;
import com.tirmizee.entities.Permission;
import com.tirmizee.entities.User;
import com.tirmizee.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PermissionDao permissionDao;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByUsername(username);
	
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		
		List<Permission> permissions = permissionDao.findByUsername(username);
		
		return new UserDetailsImpl.Builder()
			.username(user.getUsername())
			.password(user.getPassword())
			.accountNonExpired(true)
			.accountNonLocked(true)
			.enabled(true)
			.credentialsNonExpired(true)
			.authorities(grantAuthorities(permissions))
			.build();
	}

	private Set<GrantedAuthority> grantAuthorities(Collection<? extends com.tirmizee.entities.Permission> permissions){
		System.out.println(permissions.stream().map(e -> e.getPerCode()).collect(Collectors.toList()).toString());
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        permissions.forEach(o -> authorities.add(new SimpleGrantedAuthority(o.getPerCode())));
        return authorities;
	}
	
}
