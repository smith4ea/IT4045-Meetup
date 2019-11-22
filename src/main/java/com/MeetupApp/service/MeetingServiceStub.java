package com.MeetupApp.service;

import org.springframework.stereotype.Component;

import com.MeetupApp.dto.MeetingDTO;
import com.MeetupApp.dto.MeetingSearchParamsDTO;
import com.MeetupApp.dto.UserDTO;

@Component
public class MeetingServiceStub implements IMeetingService {

	@Override
	public void CreateMeeting(MeetingDTO meeting) {
		// TODO Proper Implementation
	}

	@Override
	public MeetingDTO GetMeeting(int meetingId) {
		// TODO Proper Implementation
		MeetingDTO meetup = new MeetingDTO();
		meetup.setId(meetingId);
		meetup.setTitle("Placeholder Meeting Title");
		meetup.setDescription("Placeholder Meeting Description");
		meetup.setLocalDateTime("11/19/2019 12:00PM");
		meetup.setLocation("University of Cincinnati");
		
		UserDTO o = new UserDTO();
		o.setId(1);
		o.setFirstName("John");
		o.setLastName("Doe");
		o.setEmail("john.doe@email.com");
		o.setPhone("555-555-5555");
		
		meetup.setOrganizer(o);
		
		UserDTO a1 = new UserDTO();
		a1.setId(2);
		a1.setFirstName("Jane");
		a1.setLastName("Doe");
		a1.setEmail("jane.doe@email.com");
		a1.setPhone("556-555-5556");
		
		UserDTO a2 = new UserDTO();
		a2.setId(3);
		a2.setFirstName("Joe");
		a2.setLastName("Schmo");
		a2.setEmail("joe.schmo@email.com");
		a2.setPhone("557-555-5557");
		
		UserDTO[] attendees = {a1, a2};
		meetup.setAttendees(attendees);
		
		return meetup;
	}

	@Override
	public MeetingDTO[] FindMeetings(MeetingSearchParamsDTO searchParams) {
		// TODO Proper implementation
		MeetingDTO testMeeting = GetMeeting(1);
		MeetingDTO[] meetings = {testMeeting};
		return meetings;
	}

}
