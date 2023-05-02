package com.bridgelab.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	public ListService listservice;


	@RequestMapping("/abc")
	public String abc() {
		return "<h1>Hellow</h1>";
	}

	@RequestMapping("/hello")
	public List<Person> hello() {
		return listservice.getList();
	}
	@RequestMapping("/hello/{name}")
	public Optional<Person> getPersonData(@PathVariable String name) {
		return listservice.getPerson(name);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/hello")
	public void addperson(@RequestBody Person p) {
		listservice.addPerson(p);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/hello/{name}")
	public void update(@RequestBody Person p, @PathVariable String name) {
		listservice.update(p, name);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/hello/{name}")
	public void delete(@PathVariable String name) {
		listservice.delete(name);
	}

}
