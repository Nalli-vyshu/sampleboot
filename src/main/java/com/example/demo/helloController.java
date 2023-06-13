package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	@RequestMapping("/hello")
	public String sayhello() {
		return "<h1 style='color:red'>Hello gusy welcome to spring boot</h1>";
	}
@RequestMapping("/howareyou")
   public String sayhow() {
	return "<h2>Im good what about u </h2>";
	
}
@RequestMapping("/mobiles")
public List<mobile> getMobiles() {
	return Arrays.asList (
			
			       new mobile(1,"v15pro","vivo",9999),
			       new mobile(2,"y79","vivo",23000),
			       new mobile (3,"y91","vivo",10000)
			       );
}
			       
			
		 	@RequestMapping("/laptops")
		 public List<laptop> getLaptops() {
			return Arrays.asList( new laptop(1,"15s","HP",44000),
					         new laptop(2,"E14","Lenova",25000),
					         new laptop(3,"E41","Lenova",30000)
					         );
	}
}
