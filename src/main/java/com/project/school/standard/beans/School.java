package com.project.school.standard.beans;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String about;
	
	private String location;
	
	private int contactNo;
	
	private String distance;
	
	private String emailId;
	
	private String free;
	
	private String affilation;
	
	private String rating;
	
	private String website;
	


	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public School(int id, String name, String about, String location, int contactNo, String distance, String emailId,
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

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
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
