package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellolController {
	@Autowired
	private Girlproperties girlproperties;
	
	@RequestMapping(value= {"/hello","/hi"},method=RequestMethod.POST)
	public String say() {
		return girlproperties.getCupSize();
	}
}
