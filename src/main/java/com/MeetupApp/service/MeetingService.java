package com.MeetupApp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.MeetupApp.dao.IMeetingDAO;
import com.MeetupApp.dto.MeetingDTO;
import com.MeetupApp.dto.MeetingSearchParamsDTO;

public class MeetingService implements IMeetingService {
	@Autowired
	IMeetingDAO meetingDAO;
	
	@Override
	public void CreateMeeting(MeetingDTO meeting) throws Exception {
		meetingDAO.save(meeting);
	}

	@Override
	public MeetingDTO GetMeeting(int meetingId) throws Exception {
		MeetingDTO meeting = meetingDAO.getMeeting(meetingId);
		return meeting;
	}

	@Override
	public MeetingDTO[] FindMeetings(MeetingSearchParamsDTO searchParams) {
		// TODO Auto-generated method stub
		return null;
	}

}
