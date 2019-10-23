package com.MeetupApp.service;

import com.MeetupApp.dto.MeetingDTO;

/*This interface implements
 * the MeetingDTO Service
 */
public interface IMeetingService {

	MeetingDTO fetchById(int id);
}
