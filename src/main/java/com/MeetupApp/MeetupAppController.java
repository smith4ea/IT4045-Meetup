package com.MeetupApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MeetupAppController {
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read() {
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
	
	@RequestMapping("/")
	public String index() {
		
		return "start";
	}
}
