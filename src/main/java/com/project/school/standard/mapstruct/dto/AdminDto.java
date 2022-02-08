package com.project.school.standard.mapstruct.dto;



public class AdminDto {
	

	private String userName;
	
	private String password;

	public AdminDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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
	
	

}
