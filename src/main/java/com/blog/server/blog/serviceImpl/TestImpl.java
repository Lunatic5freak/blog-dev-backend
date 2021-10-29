package com.blog.server.blog.serviceImpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.blog.server.blog.dao.testDao;
import com.blog.server.blog.dtos.UserDTO;
import com.blog.server.blog.entities.Authority;
import com.blog.server.blog.entities.User;
import com.blog.server.blog.service.Test;

@Service
@CrossOrigin(origins = "*")
public class TestImpl implements Test {
	@Autowired
	private testDao daoBean;

	@Override
	public List<User> getMethod(Integer id) {
		return daoBean.getUserData();
	}

	@Override
	public User saveUser(UserDTO user) {
		System.out.println(user);
		User u = new User();
		BeanUtils.copyProperties(user, u);
		System.out.println(u.toString());
		Authority a = new Authority();
		a.setUser(u);
		daoBean.saveUser(a);
		return u;

	}

	@Override
	public void autoLogin(String username, String password) {
		// TODO Auto-generated method stub
		UsernamePasswordAuthenticationToken a = new UsernamePasswordAuthenticationToken(username, password);
		System.out.println(a);
		if (a.isAuthenticated()) {
			SecurityContextHolder.getContext().setAuthentication(a);
			System.out.println("logged in");
		}

	}
}
