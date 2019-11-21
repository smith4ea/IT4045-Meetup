package com.MeetupApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.MeetupApp.dto.MeetingDTO;
import com.MeetupApp.dto.MeetingSearchParamsDTO;
import com.MeetupApp.dto.UserDTO;
import com.MeetupApp.service.IMeetingService;

@Controller
public class MeetupAppController {
	
	@Autowired
	private IMeetingService meetingServiceStub;
	
	@RequestMapping(value="/meeting/{meetingId}", method=RequestMethod.GET)
	public ModelAndView getMeeting(@PathVariable int meetingId) {
		ModelAndView modelAndView = new ModelAndView();
		MeetingDTO meeting = meetingServiceStub.GetMeeting(meetingId);
		modelAndView.setViewName("meeting");
		modelAndView.addObject("meeting", meeting);

		return modelAndView;
	}
	
	@RequestMapping(value="/meeting", method=RequestMethod.POST)
	public void createMeeting() {
		// TODO: Get meeting object from body
		meetingServiceStub.CreateMeeting(new MeetingDTO());
	}
	
	@RequestMapping(value="/manage-meeting-user/{meetingId}", method=RequestMethod.POST)
	public void addUserMeeting(@PathVariable int meetingId) {
		// TODO: Get user object from body
		MeetingDTO meeting = meetingServiceStub.GetMeeting(meetingId);
		meeting.AddUser(new UserDTO());
	}
	
	@RequestMapping(value="/manage-meeting-user/{meetingId}/{userId}", method=RequestMethod.DELETE)
	public void deleteUserMeeting(@PathVariable int meetingId, @PathVariable int userId) {
		// TODO: Proper implementation
		MeetingDTO meeting = meetingServiceStub.GetMeeting(meetingId);
		meeting.DeleteUser(userId);
	}
	
	@RequestMapping(value="/find-meetings", method=RequestMethod.POST)
	public MeetingDTO[] findMeeting() {
		// TODO: Get search object from body
		MeetingDTO[] meetings = meetingServiceStub.FindMeetings(new MeetingSearchParamsDTO());
		return meetings;
	}
}
