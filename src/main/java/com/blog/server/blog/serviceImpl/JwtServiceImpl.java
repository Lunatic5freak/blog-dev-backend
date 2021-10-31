package com.blog.server.blog.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.blog.server.blog.dao.AuthServiceImpl;
import com.blog.server.blog.dtos.JwtDto;
import com.blog.server.blog.dtos.JwtResponse;
import com.blog.server.blog.helper.JwtHelper;
import com.blog.server.blog.service.JwtService;

@Service
public class JwtServiceImpl implements JwtService {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private AuthServiceImpl customUserDetailsService;

	@Autowired
	private JwtHelper jwtHelper;

	@Override
	public ResponseEntity<?> generateToken(JwtDto jwtRequest) {
		System.out.println("Inside Controller");
		System.out.println(jwtRequest.getUsername());
		try {

			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));

		} catch (Exception e) {
			e.printStackTrace();
		}

		UserDetails userDetails = this.customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());

		String token = jwtHelper.generateToken(userDetails);
		System.out.println("JWT " + token);

		// {"token":"value"}

		return ResponseEntity.ok(new JwtResponse(token));

	}

}
