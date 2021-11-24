package com.howtodoinjava.demo;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeRESTController {
     
    @RequestMapping(value = "/welcome")
    public String a()
    {
    	
    	return "halo welcome to spring boot"; 
    }
}
