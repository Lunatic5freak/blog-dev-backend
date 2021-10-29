package com.blog.server.blog.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/register/**").permitAll().antMatchers("/")
				.hasAnyAuthority("USER", "ADMIN").antMatchers("/admin/**").hasAnyAuthority("ADMIN").anyRequest()
				.authenticated().and().formLogin().loginPage("/login").defaultSuccessUrl("/5").permitAll().and()
				.logout().permitAll().and().csrf().disable();

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource);
	}
}
