package com.project.school.standard.service;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.school.standard.beans.School;
import com.project.school.standard.exceptions.ContactNumberMismatchExceptions;
import com.project.school.standard.exceptions.EmailInputExceptions;
import com.project.school.standard.exceptions.InvalidInputException;
import com.project.school.standard.exceptions.SchoolNameMatchException;
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
//		List<School> schoolList = schoolRepo.findAll();
//		List<String > schoolListString = schoolList.stream().map(School::getName).toList();
		School schools = null;
//		for (int i=0;i<schoolListString.size();i++) {
//			if(school.getName().equalsIgnoreCase(schoolListString.get(i))) {
//				throw new SchoolNameMatchException("School Already Available in the list");
//			}
//		}
		if(school.getName().equalsIgnoreCase(null)) {
			throw new InvalidInputException("Name is not found");
	}else {
				if(mobileNoValidation(school.getContactNo())) {
					if(emailIdValidation(school.getEmailId())) {
					    schools = schoolRepo.save(school);
					}else
					{
					  throw new EmailInputExceptions("EmailId misses the format");	
					}
				}else {
			       throw new ContactNumberMismatchExceptions("Contact Number misses the formart");		
				}
			}
		
		return conSchool.convertSchooltoSchoolDto(schools);
	}

	@Override
	public SchoolDto updateSchool(School school) {
		// TODO Auto-generated method stub
		
		School schools = null;
		if(school.getName().equalsIgnoreCase(null)) {
			throw new InvalidInputException("Name is not found");
	}else {
				if(mobileNoValidation(school.getContactNo())) {
					if(emailIdValidation(school.getEmailId())) {
					    schools = schoolRepo.save(school);
					}else
					{
					  throw new EmailInputExceptions("EmailId misses the format");	
					}
				}else {
			       throw new ContactNumberMismatchExceptions("Contact Number misses the formart");		
				}
			}

		
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
	
	
	private static boolean mobileNoValidation(String mobileNo) {
		boolean flag = false;
		if (Pattern.matches("^[6-9][0-9]{9}$", mobileNo)) {
			flag = true;
		}
		return flag;
	}
	
	
	
	private static boolean emailIdValidation(String emailId) {
		boolean flag = false;
		if (Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",emailId)) {
			flag = true;
		}
		return flag;
	}
	

}
