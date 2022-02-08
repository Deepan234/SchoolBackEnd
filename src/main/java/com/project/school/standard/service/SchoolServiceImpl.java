package com.project.school.standard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.school.standard.beans.School;
import com.project.school.standard.exceptions.InvalidInputException;
import com.project.school.standard.mapstruct.convertutils.ConvertedSchool;
import com.project.school.standard.mapstruct.dto.SchoolDto;
import com.project.school.standard.repo.ISchoolRepo;


@Service("schoolService")
public class SchoolServiceImpl implements ISchoolService {

	
	@Autowired
	ISchoolRepo schoolRepo;
	
	@Autowired
	ConvertedSchool conSchool;
	
	@Override
	public SchoolDto addSchool(School school) {
		// TODO Auto-generated method stub
		School schools = schoolRepo.save(school);
		return conSchool.convertSchooltoSchoolDto(schools);
	}

	@Override
	public SchoolDto updateSchool(School school) {
		// TODO Auto-generated method stub
		
		School schools = schoolRepo.save(school);
		return conSchool.convertSchooltoSchoolDto(schools);
	}

	@Override
	public SchoolDto getSchool(int id) {
		// TODO Auto-generated method stub
	     School school = schoolRepo.getById(id);
	     if(school == null) {
	    	 throw new InvalidInputException("Given Id is not Present");
	     }else {
	       return conSchool.convertSchooltoSchoolDto(school);    	 
	     }
	}

	@Override
	public List<School> getAllSchool() {
		// TODO Auto-generated method stub
		List<School> school = schoolRepo.findAll();
		return school;
	}

	@Override
	public String deleteSchool(int id) {
		// TODO Auto-generated method stub
		School school = schoolRepo.getById(id);
		if(school == null) {
			throw new InvalidInputException("Id is not found");
		}
		else {
			schoolRepo.delete(school);
			return "Deleted Sucessfully";
		}
	}
	
	
	

}
