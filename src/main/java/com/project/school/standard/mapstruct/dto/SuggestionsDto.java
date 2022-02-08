package com.project.school.standard.mapstruct.dto;

public class SuggestionsDto {
	
	private int id;
	
	private String name;
	
	private String email;

	private String schoolName;
	
	private String schoolAddress;

	private String contactNo;
	
	private String schoolEmailId;

	private String affliation;
	
	private String about;

	public SuggestionsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuggestionsDto(int id, String name, String email, String schoolName, String schoolAddress, String contactNo,
			String schoolEmailId, String affliation, String about) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.contactNo = contactNo;
		this.schoolEmailId = schoolEmailId;
		this.affliation = affliation;
		this.about = about;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getSchoolEmailId() {
		return schoolEmailId;
	}

	public void setSchoolEmailId(String schoolEmailId) {
		this.schoolEmailId = schoolEmailId;
	}

	public String getAffliation() {
		return affliation;
	}

	public void setAffliation(String affliation) {
		this.affliation = affliation;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	

}
