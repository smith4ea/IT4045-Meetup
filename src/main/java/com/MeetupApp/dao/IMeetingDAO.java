package com.MeetupApp.dao;

import com.MeetupApp.dto.MeetingDTO;

public interface IMeetingDAO {
	boolean save(MeetingDTO meetingDto) throws Exception;
	Iterable<MeetingDTO> fetchAll() throws Exception;
	MeetingDTO getMeeting(int id) throws Exception;
}
