package com.blog.server.blog.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.blog.server.blog.dtos.CustomUserDetails;
import com.blog.server.blog.entities.Authority;
import com.blog.server.blog.entities.User;

@Service
public class AuthServiceImpl implements UserDetailsService {

	@Autowired
	private testDao userDao;
//
//	@Override
//	public User findByUsername(String name) {
//		// TODO Auto-generated method stub
//		return userDao.findByUsername(name);
//	}
//
//	@Override
//	public List<Authority> getAllAuthorities(String username) {
//		// TODO Auto-generated method stub
//		return userDao.getAuthority(username);
//	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("kjfhed");
		List<Authority> auth = userDao.getAuthority(username);
		System.out.println(auth.size());
		User u = auth.get(0).getUser();
		if (u == null) {
			return null;
		}
		return new CustomUserDetails(auth.get(0));
	}

}
