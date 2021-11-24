package com.howtodoinjava.demo;

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
