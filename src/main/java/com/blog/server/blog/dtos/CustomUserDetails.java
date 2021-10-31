package com.blog.server.blog.dtos;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.blog.server.blog.entities.Authority;

public class CustomUserDetails implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private User user;
	private Authority authority;

	public CustomUserDetails(Authority auth) {
		this.authority = auth;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(authority.getRole());
		return List.of(simpleGrantedAuthority);
	}

	@Override
	public String getPassword() {
		return authority.getUser().getPassword();
	}

	@Override
	public String getUsername() {
		return authority.getUser().getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
