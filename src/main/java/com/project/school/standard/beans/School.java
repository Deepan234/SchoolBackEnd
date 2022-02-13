package com.project.school.standard.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotNull(message="Name Should not Left Null")
	@Pattern(regexp = "^[A-Za-z ]{3,20}$", message = "Name must only be alphabets and whitespaces from 3 to 20 characters")
	private String name;
	
	@NotNull(message="Write about")
	private String about;
	
	@NotNull(message="Location should not be null")
	private String location;
	
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}", message = "Mobile number should be a 10 digit number with first digit from 6 to 9")
	private String contactNo;
	
	private String distance;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "should be in email format")
	private String emailId;
	
	private String free;
	
	private String affilation;
	
	private String rating;
	
	private String website;
	


	public School() {
		super();
		// TODO Auto-generated constructor stub
	}



	public School(int id,
			@NotNull(message = "Name Should not Left Null") @Pattern(regexp = "^[A-Za-z ]{3,20}$", message = "Name must only be alphabets and whitespaces from 3 to 20 characters") String name,
			@NotNull(message = "Write about") String about,
			@NotNull(message = "Location should not be null") String location,
			@Pattern(regexp = "^[6-9]{1}[0-9]{9}", message = "Mobile number should be a 10 digit number with first digit from 6 to 9") String contactNo,
			String distance,
			@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "should be in email format") String emailId,
			String free, String affilation, String rating, String website) {
		super();
		this.id = id;
		this.name = name;
		this.about = about;
		this.location = location;
		this.contactNo = contactNo;
		this.distance = distance;
		this.emailId = emailId;
		this.free = free;
		this.affilation = affilation;
		this.rating = rating;
		this.website = website;
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



	public String getAbout() {
		return about;
	}



	public void setAbout(String about) {
		this.about = about;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getContactNo() {
		return contactNo;
	}



	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}



	public String getDistance() {
		return distance;
	}



	public void setDistance(String distance) {
		this.distance = distance;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getFree() {
		return free;
	}



	public void setFree(String free) {
		this.free = free;
	}



	public String getAffilation() {
		return affilation;
	}



	public void setAffilation(String affilation) {
		this.affilation = affilation;
	}



	public String getRating() {
		return rating;
	}



	public void setRating(String rating) {
		this.rating = rating;
	}



	public String getWebsite() {
		return website;
	}



	public void setWebsite(String website) {
		this.website = website;
	}
		
}
