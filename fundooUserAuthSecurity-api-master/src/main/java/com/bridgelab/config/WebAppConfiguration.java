package com.bridgelab.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@SuppressWarnings("deprecation")
@EnableWebSecurity
public class WebAppConfiguration extends WebSecurityConfigurerAdapter
{
   @Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	   																						//set your authentication on auth object
  auth.inMemoryAuthentication().withUser("abc").password("abc").roles("USER"); 
   }
   
 protected void confiqure(HttpSecurity http) throws Exception {
	http.authorizeRequests().antMatchers("/**").hasRole("Admin")
	.and().formLogin();
	
 }
  @Bean
   public  PasswordEncoder getPasswordEncoder()				  //encode passoword
   {
 	return   NoOpPasswordEncoder.getInstance();
   }
  
}
