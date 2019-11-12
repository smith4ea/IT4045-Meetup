package com.MeetupApp.service;

import org.springframework.stereotype.Component;

import com.MeetupApp.dto.MeetingDTO;
import com.MeetupApp.dto.MeetingSearchParamsDTO;

@Component
public class MeetingServiceStub implements IMeetingService {

	@Override
	public void CreateMeeting(MeetingDTO meeting) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MeetingDTO GetMeeting(int meetingId) {
		// TODO Auto-generated method stub
		return new MeetingDTO();
	}

	@Override
	public MeetingDTO[] FindMeetings(MeetingSearchParamsDTO searchParams) {
		// TODO Auto-generated method stub
		return null;
	}

}
