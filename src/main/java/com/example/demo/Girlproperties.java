package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="girl")
public class Girlproperties {
	private String CupSize;
	private Integer age;
	public String getCupSize() {
		return CupSize;
	}
	public void setCupSize(String cupSize) {
		CupSize = cupSize;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
