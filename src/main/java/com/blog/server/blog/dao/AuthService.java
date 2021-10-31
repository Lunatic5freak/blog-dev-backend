package com.blog.server.blog.dao;

import java.util.List;

import com.blog.server.blog.entities.Authority;
import com.blog.server.blog.entities.User;

public interface AuthService {

	public User findByUsername(String name);

	public List<Authority> getAllAuthorities(String username);

}
