package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {
	@Autowired
	private GirlRepository girlRepository;
	@GetMapping(value="/girls")
	public List<Girl> list(){
		return girlRepository.findAll();
	}
	
	@PostMapping(value="/girls")
	public Girl addGirl(@RequestParam("age")Integer age,
						@RequestParam("cupSize")String cupSize) {
		Girl girl = new Girl();
		girl.setAge(age);
		girl.setCupSize(cupSize);
		return girlRepository.save(girl);
	}
	//put请求使用x-www-form-urlencoded
	@PutMapping(value="/girls/{id}")
	public Girl updateGirl(@PathVariable("id")Integer id,
			@RequestParam("age")Integer age,
			@RequestParam("cupSize")String cupSize) {
		Girl girl = new Girl();
		girl.setId(id);
		girl.setAge(age);
		girl.setCupSize(cupSize);
		return girlRepository.save(girl);
	}
	@DeleteMapping(value="/girls/{id}")
	public void deletegirl(@PathVariable("id")Integer id) {
		girlRepository.delete(id);
	}
	@GetMapping(value="/girls/{id}")
	public Girl getone(@PathVariable("id")Integer id) {
		
		return girlRepository.findOne(id);
	}
	//此处  必须加一级/age   可以不是age   a也可以
	@GetMapping(value="/girls/a/{age}")
	public List<Girl> findByAge(@PathVariable("age")Integer age){
		return girlRepository.findByAge(age);
	}
}
