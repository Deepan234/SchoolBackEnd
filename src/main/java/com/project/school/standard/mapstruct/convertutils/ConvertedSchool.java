package com.project.school.standard.mapstruct.convertutils;

import org.springframework.stereotype.Component;

import com.project.school.standard.beans.School;
import com.project.school.standard.mapstruct.dto.SchoolDto;

@Component
public class ConvertedSchool {
	
	public SchoolDto convertSchooltoSchoolDto(School school) {
		
		SchoolDto schoolDto = new SchoolDto();
		schoolDto.setId(school.getId());
		schoolDto.setName(school.getName());
		schoolDto.setLocation(school.getLocation());
		schoolDto.setAbout(school.getAbout());
		schoolDto.setContactNo(school.getContactNo());
		schoolDto.setAffilation(school.getAffilation());
		schoolDto.setDistance(school.getDistance());
		schoolDto.setEmailId(school.getEmailId());
		schoolDto.setFree(school.getFree());
		
		schoolDto.setRating(school.getRating());
		
		schoolDto.setWebsite(school.getWebsite());
   
		return schoolDto;
		
	}
	
	public School convertSchoolDtotoSchool(SchoolDto schoolDto) {
            
		School school = new School();
		school.setId(schoolDto.getId());
		school.setName(schoolDto.getName());
		school.setLocation(schoolDto.getLocation());
		school.setAbout(schoolDto.getAbout());
		school.setContactNo(schoolDto.getContactNo());
		school.setAffilation(schoolDto.getAffilation());
		school.setDistance(schoolDto.getDistance());
		school.setEmailId(schoolDto.getEmailId());
		school.setFree(schoolDto.getFree());
		school.setRating(schoolDto.getRating());
	    school.setWebsite(school.getWebsite());	
          
	    return school;
	
	}

}
