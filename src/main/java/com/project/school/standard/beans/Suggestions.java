package com.project.school.standard.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Suggestions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotNull(message="Name Should not Left Null")
	@Pattern(regexp = "^[A-Za-z ]{3,30}$", message = "Name must only be alphabets and whitespaces from 3 to 30 characters")	
	private String name;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "should be in email format")
	private String email;

	@NotNull(message="SchoolName should not be null")
	private String schoolName;
	
	@NotNull(message="SchoolAddress should not be null")
	private String schoolAddress;

	@Pattern(regexp = "^[6-9]{1}[0-9]{9}", message = "Mobile number should be a 10 digit number with first digit from 6 to 9")
	private String contactNo;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "should be in email format")	
	private String schoolEmailId;

	private String affliation;
     
	@NotNull(message="Write About")
	private String about;

	public Suggestions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Suggestions(int id,
			@NotNull(message = "Name Should not Left Null") @Pattern(regexp = "^[A-Za-z ]{3,20}$", message = "Name must only be alphabets and whitespaces from 3 to 20 characters") String name,
			@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "should be in email format") String email,
			@NotNull(message = "SchoolName should not be null") String schoolName,
			@NotNull(message = "SchoolAddress should not be null") String schoolAddress,
			@Pattern(regexp = "^[6-9]{1}[0-9]{9}", message = "Mobile number should be a 10 digit number with first digit from 6 to 9") String contactNo,
			@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "should be in email format") String schoolEmailId,
			String affliation, @NotNull(message = "Write About") String about) {
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
