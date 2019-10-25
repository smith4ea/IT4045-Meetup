package com.MeetupApp.dto;

public class MeetingSearchParamsDTO {
	String Title;
	String Description;
	String LocalDateTime;
	String Zip;
	String Category;
	Boolean MatchAll;
	
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
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Boolean getMatchAll() {
		return MatchAll;
	}
	public void setMatchAll(Boolean matchAll) {
		MatchAll = matchAll;
	}
}
