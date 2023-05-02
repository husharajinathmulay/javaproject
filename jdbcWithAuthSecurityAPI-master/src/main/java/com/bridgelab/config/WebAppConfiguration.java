package com.bridgelab.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class WebAppConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource data_Source;
	
	@Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	   			auth.jdbcAuthentication()
	   			.dataSource(data_Source);	   			                                                   //set your authentication on auth objec
   }

	protected void confiqure(HttpSecurity http) throws Exception {
              http.authorizeRequests()
              .antMatchers("/admin").hasRole("/admin")
              .antMatchers("/user").hasAnyRole("/admin","/user")
              .and().formLogin();
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() // encode passoword
	{
		return NoOpPasswordEncoder.getInstance();
	}

}
