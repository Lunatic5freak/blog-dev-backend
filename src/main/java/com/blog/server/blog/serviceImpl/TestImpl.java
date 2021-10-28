package com.blog.server.blog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.blog.server.blog.dao.testDao;
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
}
