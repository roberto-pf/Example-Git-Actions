package es.com.disastercode.example1.gitactions.examplegitactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyRestController {

	@GetMapping(value = "dummy")
	public String dummy() {
	    return "ok";
	}    
}
