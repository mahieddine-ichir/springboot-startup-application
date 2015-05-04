package com.michir.projects.controllers.rest;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Collection<String> get() {
		return Arrays.asList("Hello", "World!");
	}

}
