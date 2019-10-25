package com.MeetupApp.service;
import com.MeetupApp.dto.MeetingDTO;
import com.MeetupApp.dto.MeetingSearchParamsDTO;

public interface IMeetingService {
	void CreateMeeting(MeetingDTO meeting);
	MeetingDTO GetMeeting(int meetingId);
	MeetingDTO[] FindMeetings(MeetingSearchParamsDTO searchParams);
}
