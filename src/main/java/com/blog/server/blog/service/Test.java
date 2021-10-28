package com.blog.server.blog.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.server.blog.entities.User;

@RestController
public interface Test {

	@GetMapping("/{id}")
	public List<User> getMethod(@PathVariable("id") Integer id);

}
