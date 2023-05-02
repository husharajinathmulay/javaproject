package com.bridgelab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HomeController 
{
	 @GetMapping("/login")
	 public String  loginLogin()
	 {
		 return "<h1>WELCOME USER</h1>";
	 }
	 @GetMapping("/admin")
	 public String adminLogin()
	 {
		return "<h1>WELCOME ADMIN</h1>"; 
	 }

}
