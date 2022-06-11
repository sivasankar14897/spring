package com.siva.api;


//DTO-Data Transfer Object
//DTO are used to send data when there are lots of fields.

public class UserInfoDto {
	private String yourname;
	private String crushname;
	public String getYourname() {
		return yourname;
	}
	public void setYourname(String yourname) {
		this.yourname = yourname;
	}
	public String getCrushname() {
		return crushname;
	}
	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}
	
}
