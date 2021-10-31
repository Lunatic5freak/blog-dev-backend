package com.blog.server.blog.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blog.server.blog.dtos.JwtDto;

@RestController
@CrossOrigin("*")
public interface JwtService {

	@PostMapping("/token/")
	public ResponseEntity<?> generateToken(@RequestBody JwtDto jwtRequest);
}
