package com.MeetupApp.service;
import com.MeetupApp.dto.MeetingDTO;
import com.MeetupApp.dto.MeetingSearchParamsDTO;

public interface IMeetingService {
	void CreateMeeting(MeetingDTO meeting) throws Exception;
	MeetingDTO GetMeeting(int meetingId) throws Exception;
	MeetingDTO[] FindMeetings(MeetingSearchParamsDTO searchParams);
}
