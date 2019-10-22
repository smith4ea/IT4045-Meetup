package com.MeetupApp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MeetupAppController {
	@RequestMapping(value="/meeting/{meetingId}", method=RequestMethod.GET)
	public String getMeeting(@PathVariable int meetingId) {
		return "NOT IMPLEMENTED";
	}
	
	@RequestMapping(value="/meeting", method=RequestMethod.POST)
	public String createMeeting() {
		// TODO: Get new meeting object from body
		return "NOT IMPLEMENTED";
	}
	
	@RequestMapping(value="/manage-meeting-user/{meetingId}", method=RequestMethod.POST)
	public String addUserMeeting(@PathVariable int meetingId) {
		// TODO: Get user object from body
		return "NOT IMPLEMENTED";
	}
	
	@RequestMapping(value="/manage-meeting-user/{meetingId}/{userId}", method=RequestMethod.DELETE)
	public String deleteUserMeeting(@PathVariable int meetingId, @PathVariable int userId) {
		return "NOT IMPLEMENTED";
	}
	
	@RequestMapping(value="/meeting", method=RequestMethod.POST)
	public String findMeeting() {
		// TODO: Get search meeting object from body
		return "NOT IMPLEMENTED";
	}
}
