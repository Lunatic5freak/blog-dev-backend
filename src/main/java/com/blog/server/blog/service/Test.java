package com.blog.server.blog.service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blog.server.blog.dtos.UserDTO;
import com.blog.server.blog.entities.User;

@RestController
@CrossOrigin("*")
public interface Test {

	@GetMapping("/{id}")
	public List<User> getMethod(@PathVariable("id") Integer id);

	@PostMapping("/")
	public User saveUser(@RequestBody UserDTO user);

	@PostMapping("/login")
	public void autoLogin(@RequestBody String username, @RequestBody String password);

}
