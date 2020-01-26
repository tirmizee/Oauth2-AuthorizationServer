package com.tirmizee.config.security;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.lang.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Pratya Yeekhday
 *
 */
public class UserDetailsImpl implements UserDetails {
	
	private static final long serialVersionUID = -3739827555840905814L;
	
	private String username;
	private String password;
	private boolean enabled;
	private boolean accountNonLocked;
	private boolean accountNonExpired;
	private boolean credentialsNonExpired;
	private Collection<? extends GrantedAuthority> authorities;
	
	public UserDetailsImpl(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		if (StringUtils.isEmpty(username) || (password == null)) {
			throw new IllegalArgumentException("Cannot pass null or empty values to constructor");
		}
		this.username = username;
		this.password = password;
		this.authorities = authorities;
		this.enabled = true;
		this.accountNonLocked = true;
		this.accountNonExpired = true;
		this.accountNonLocked = true;
		this.credentialsNonExpired = true;
	}

	public UserDetailsImpl(Builder builder) {
		if (StringUtils.isEmpty(builder.username) || (builder.password == null)) {
			throw new IllegalArgumentException("Cannot pass null or empty values to constructor");
		}
		this.username = builder.username;
		this.password = builder.password;
		this.authorities = builder.authorities;
		this.enabled = builder.enabled;
		this.accountNonLocked = builder.accountNonLocked;
		this.accountNonExpired = builder.accountNonExpired;
		this.accountNonLocked = builder.accountNonLocked;
		this.credentialsNonExpired = builder.credentialsNonExpired;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	
	@Override
	public String getPassword() {
		return password;
	}
	
	@Override
	public String getUsername() {
		return username;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}
	
	@Override
	public boolean isEnabled() {
		return enabled;
	}
	
	@Override
    public boolean equals(Object obj) {
		if (obj instanceof UserDetails) {
			return username.equals(((UserDetails) obj).getUsername());
        }
        return false;
    }

	@Override
	public int hashCode() {
		return username != null ? username.hashCode() : 0;
	}
	
	public static class Builder {
		
		private String username;
		private String password;
		private boolean enabled;
		private boolean accountNonLocked;
		private boolean accountNonExpired;
		private boolean credentialsNonExpired;
		private Collection<? extends GrantedAuthority> authorities;
		
		public Builder(){}
		
		public Builder username(String username){
			this.username = username;
			return this;
		}
		
		public Builder password(String password){
			this.password = password;
			return this;
		}
		
		public Builder authorities(Collection<? extends GrantedAuthority>  authorities){
			this.authorities = authorities;
			return this;
		}
		
		public Builder authorities(GrantedAuthority...authorities) {
			return authorities(Arrays.asList(authorities));
		}
		
		public Builder authorities(String... authorities) {
			return authorities(AuthorityUtils.createAuthorityList(authorities));
		}
		
		public Builder enabled(boolean enabled){
			this.enabled = enabled;
			return this;
		}
		
		public Builder accountNonLocked(boolean accountNonLocked){
			this.accountNonLocked = accountNonLocked;
			return this;
		}
		
		public Builder accountNonExpired(boolean accountNonExpired){
			this.accountNonExpired = accountNonExpired;
			return this;
		}
		
		public Builder credentialsNonExpired(boolean credentialsNonExpired){
			this.credentialsNonExpired = credentialsNonExpired;
			return this;
		}
		
		public UserDetailsImpl build(){
			return new UserDetailsImpl(this);
		}
	
	}
	
}
