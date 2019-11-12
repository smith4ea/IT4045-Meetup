package com.MeetupApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MeetupApp.dto.MeetingDTO;
import com.MeetupApp.service.IMeetingService;

@RestController
public class MeetupAppController {
	
	@Autowired
	private IMeetingService meetingServiceStub;
	
	@RequestMapping(value="/meeting/{meetingId}", method=RequestMethod.GET)
	public MeetingDTO getMeeting(@PathVariable int meetingId) {
		MeetingDTO meeting = meetingServiceStub.GetMeeting(meetingId);
		return meeting;
	}
	
	@RequestMapping(value="/meeting", method=RequestMethod.POST)
	public String createMeeting() {
		// TODO: Get meeting object from body
		return "NOT IMPLEMENTED";
	}
	
	@RequestMapping(value="/manage-meeting-user/{meetingId}", method=RequestMethod.POST)
	public String addUserMeeting(@PathVariable int meetingId) {
		// TODO: Get user object from body
		return "NOT IMPLEMENTED";
	}
	
	@RequestMapping(value="/manage-meeting-user/{meetingId}/{userId}", method=RequestMethod.DELETE)
	public String deleteUserMeeting(@PathVariable int meetingId, @PathVariable int userId) {
		// TODO: Move logic to service?
		MeetingDTO meeting = meetingServiceStub.GetMeeting(meetingId);
		meeting.DeleteUser(userId);
		return "NOT IMPLEMENTED";
	}
	
	@RequestMapping(value="/find-meetings", method=RequestMethod.POST)
	public String findMeeting() {
		// TODO: Get search object from body
		return "NOT IMPLEMENTED";
	}
}
