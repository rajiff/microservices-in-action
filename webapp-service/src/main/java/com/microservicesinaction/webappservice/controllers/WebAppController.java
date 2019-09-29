package com.microservicesinaction.webappservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

// @RestController
@Controller
public class WebAppController {
	@RequestMapping("")
	public String forward() {
		System.out.println("[*] Forwarding to index route");
		return "forward:/index.html";
	}
}
