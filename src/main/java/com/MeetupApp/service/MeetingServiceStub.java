package com.MeetupApp.service;

import com.MeetupApp.dto.MeetingDTO;
import com.MeetupApp.dto.MeetingSearchParamsDTO;

public class MeetingServiceStub implements IMeetingService {

	/**
	 * Java doc to inform what the service stub is doing
	 * This is the service stub that implements meeting creations,
	 * finding specific meetings, and getting meetings. More to be added
	 */
	@Override
	public void CreateMeeting(MeetingDTO meeting) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MeetingDTO GetMeeting(int meetingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeetingDTO[] FindMeetings(MeetingSearchParamsDTO searchParams) {
		// TODO Auto-generated method stub
		return null;
	}

}
