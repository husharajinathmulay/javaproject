package com.bridgelab.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelab.demo.Person;

@Service
public class ListService {
	private List<Person> list = new ArrayList<Person>(
			Arrays.asList(new Person("milind", 22, "engg"), new Person("rahul", 21, "engg")));

	public List<Person> getList() {
		return list;
	}

	public Person getPerson(String name) {
		return list.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}

	public void addPerson(Person p) {
		list.add(p);
	}

	public void update(Person p, String name) {
		int i = 0;
		for (Person t : list) {
			if (t.getName().equals(name)) {
				list.set(i, p);
			}
			i++;
		}
	}

	public void delete(String name) {
		   list.removeIf(t-> t.getName().equalsIgnoreCase(name));
		}
	}


