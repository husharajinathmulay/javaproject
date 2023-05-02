package com.bridgelab.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelab.demo.services.ListService;
@RestController
public class HomeController 
{
	
	@Autowired
	public ListService listservice;
	
	
@RequestMapping("/hello")
  public List<Person> hello()
  {
	  return listservice.getList();
	  
  }
 
@RequestMapping("/hello/{name}")
public Person getPersonData(@PathVariable String name)
{
	 return listservice.getPerson(name);
} 

@RequestMapping(method=RequestMethod.POST,value="/hello")
public void addperson(@RequestBody Person p)
{
	listservice.addPerson(p);
}
@RequestMapping(method=RequestMethod.PUT,value="/hello/{name}")
public void update(@RequestBody Person p,@PathVariable String name)
{
	 listservice.update(p,name);
}
@RequestMapping(method=RequestMethod.DELETE,value="/hello/{name}")
public void delete(@PathVariable String name)
{
	listservice.delete(name);
}


}
