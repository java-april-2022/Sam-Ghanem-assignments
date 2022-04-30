package com.DaikichiPathVariables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiPathVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariablesApplication.class, args);
	}
    @RequestMapping("")
    public String hello() {
            return "Hello & Welcome!";
    }
    @RequestMapping("/today")
    public String today() {
            return "Today is your lucky day!";
    }
    @RequestMapping("/tomorrow")
    public String tomorrow() {
            return "Tomorrow an cool things will happen";
    }

    @RequestMapping("/travel/{city}")
    public String travel(@PathVariable String city) {
    	return "Congratulations! You will soon travel to " +city;
    }
    
    @RequestMapping("/lotto/{num}")
    public String lotto(@PathVariable int num) {
    	if (num % 2 == 0) {
    		return "Well looks like you won a trip";
    		}
    	else {
    		return "You lose hahaha .";
    	}
    	
    }


}
