package com.project.school.standard.mapstruct.dto;

public class UserDto {

	
    private String  userName;
	
	private String password;
	
	private String phoneNo;
	
	private String emailId;
	
	private String gender;

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(String userName, String password, String phoneNo, String emailId, String gender) {
		super();
		this.userName = userName;
		this.password = password;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
