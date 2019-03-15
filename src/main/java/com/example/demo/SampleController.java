package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Value("${property1:from-local1}")
	private String property1;

	@Value("${property2:from-local2}")
	private String property2;

	@Autowired
	private MyConfig myConfig;

	@GetMapping(value = "/property")
	public String getMethodName() {
		System.out.println(property1);
		System.out.println(property2);
		return myConfig.getMessage() + "     " + property1 + "     " + property2;
	}

}
