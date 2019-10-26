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
	/**
	 * Potential function to return the meetings that a specific user has
	 * @return
	 */

	@RequestMapping(value ="/Meetings/{userID}", method=RequestMethod.POST)
	public String listMeetings() {
		//Gather meetings based on the userID
		return "ToDo";
	}
}
