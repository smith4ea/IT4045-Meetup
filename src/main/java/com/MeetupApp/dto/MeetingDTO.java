package com.MeetupApp.dto;

public class MeetingDTO {
	int Id = null;
	String Title = null;
	String Description = null;
	String LocalDateTime = null;
	String Location = null;
	UserDTO Organizer;
	UserDTO[] Attendees;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getLocalDateTime() {
		return LocalDateTime;
	}

	public void setLocalDateTime(String localDateTime) {
		LocalDateTime = localDateTime;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public UserDTO getOrganizer() {
		return Organizer;
	}

	public void setOrganizer(UserDTO organizer) {
		Organizer = organizer;
	}

	public UserDTO[] getAttendees() {
		return Attendees;
	}

	public void setAttendees(UserDTO[] attendees) {
		Attendees = attendees;
	}

	public void Modify(MeetingDTO meeting) {
		// UNIMPLEMENTED
	}
	
	public void AddUser(UserDTO user) {
		// UNIMPLEMENTED
	}
	
	public void DeleteUser(int userId) {
		// UNIMPLEMENTED
	}
}
