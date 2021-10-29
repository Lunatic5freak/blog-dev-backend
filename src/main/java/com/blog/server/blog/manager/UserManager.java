package com.blog.server.blog.manager;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.server.blog.dao.testDao;
import com.blog.server.blog.entities.Authority;

public class UserManager {

	@Autowired
	private testDao test;

	@Transactional
	public void SaveUser(Authority a) {
		a.setRole("USER");
		test.saveUser(a);
	}
}
