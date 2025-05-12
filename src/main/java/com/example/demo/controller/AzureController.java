package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {
	  @GetMapping("/hello")
	    public String hello() {
	        return "Hello from Azure Spring Apps\n";
	    }
}
