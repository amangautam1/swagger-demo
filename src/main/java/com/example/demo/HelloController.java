package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/java")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/sayHi")
	public String sayHello() {
		return "Swagger Hello World";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/sayHiToName")
	public String getText(@RequestParam("name") String name) {
		return "Hello "+name; 
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/sayHiTObject")
	public String getText(@RequestBody Obj obj) {

		return "Hello "+obj.getName(); 
	}
}
class Obj{
	String name;
	int id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Obj [name=" + name + ", id=" + id + "]";
	}
	
}