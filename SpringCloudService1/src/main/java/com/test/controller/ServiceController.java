package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class ServiceController {
	@GetMapping("/openac")
	public String acCreateService() {
		return "Service1 Controller AC create operations";
	}
}
