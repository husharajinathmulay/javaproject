package com.bridgelab.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelab.demo.Person;

@Service
public class ListService 
{   @Autowired
	private PersonRepository personRepository;
	
	public List<Person> getList() {
		List<Person> list1=new ArrayList<Person>();
		personRepository.findAll().forEach(list1::add);
		return list1;
	}
	public Optional<Person> getPerson(String name) {
		//return list.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	  return personRepository.findById(name);
	}

	public void addPerson(Person p) 
	{
		personRepository.save(p);
	}

	public void update(Person p, String name) {
		personRepository.save(p);
	}

	public void delete(String name) {
//		list.removeIf(t -> t.getName().equalsIgnoreCase(name));
		personRepository.deleteById(name);
	}
}
