package com.project.school.standard.service;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.school.standard.beans.School;
import com.project.school.standard.beans.Suggestions;
import com.project.school.standard.exceptions.ContactNumberMismatchExceptions;
import com.project.school.standard.exceptions.EmailInputExceptions;
import com.project.school.standard.exceptions.InvalidInputException;
import com.project.school.standard.exceptions.SchoolNameMatchException;
import com.project.school.standard.mapstruct.convertutils.ConvertedSuggestions;
import com.project.school.standard.mapstruct.dto.SuggestionsDto;
import com.project.school.standard.repo.ISchoolRepo;
import com.project.school.standard.repo.ISuggestionRepo;


@Service("suggestionService")
public class SuggestionServiceImpl implements ISuggestionService {
	
	
	@Autowired
	ISuggestionRepo suggestionRepo;
	
	@Autowired
	ConvertedSuggestions conSuggestions;
	
	@Autowired
	ISchoolRepo schoolRepo;

	@Override
	public SuggestionsDto addSuggestions(Suggestions suggestions) {
		// TODO Auto-generated method stub
//		List<School> schoolList = schoolRepo.findAll();
		Suggestions suggestion = null;
//		List<String > schoolListString = schoolList.stream().map(School::getName).toList();
//		for (int i=0;i<schoolListString.size();i++) {
//			if(suggestions.getSchoolName().equalsIgnoreCase(schoolListString.get(i))) {
//				throw new SchoolNameMatchException("School Already Available in the list");
//			}
//		}
		if(suggestions.getName().equalsIgnoreCase(null)) {
				throw new InvalidInputException("Name is not found");
		}else {
					if(mobileNoValidation(suggestions.getContactNo())) {
						if(emailIdValidation(suggestions.getEmail())) {
						if(emailIdValidation(suggestions.getSchoolEmailId())) {
							suggestion = suggestionRepo.save(suggestions);
						}else {
							throw new EmailInputExceptions("School Email Id misses the format");
						}
						}else
						{
						  throw new EmailInputExceptions("EmailId misses the format");	
						}
					}else {
				       throw new ContactNumberMismatchExceptions("Contact Number misses the formart");		
					}
				}

		return conSuggestions.convertSuggestionsToSuggestionDto(suggestion);
	}

	@Override
	public List<Suggestions> getAllSuggestions() {
		// TODO Auto-generated method stub
	    List<Suggestions> suggestionList = suggestionRepo.findAll();
		return suggestionList;
	}
	
	public SuggestionsDto getSuggestionById(int id){
         Suggestions suggestions = suggestionRepo.getById(id);
         if(suggestions == null ) {
        	 throw new InvalidInputException("Id is wrong");
         }else {
        	 return conSuggestions.convertSuggestionsToSuggestionDto(suggestions);
         }
	}
	
	public String deleteSuggestion(int id) {
		Suggestions sug = suggestionRepo.getById(id);
		if(sug == null) {
			throw new InvalidInputException("Id is wrong");
		}else {
			suggestionRepo.delete(sug);
			return "Deleted Sucessfuly";
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
