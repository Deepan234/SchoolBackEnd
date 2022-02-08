package com.project.school.standard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.school.standard.beans.Suggestions;
import com.project.school.standard.exceptions.InvalidInputException;
import com.project.school.standard.mapstruct.convertutils.ConvertedSuggestions;
import com.project.school.standard.mapstruct.dto.SuggestionsDto;
import com.project.school.standard.repo.ISuggestionRepo;


@Service("suggestionService")
public class SuggestionServiceImpl implements ISuggestionService {
	
	
	@Autowired
	ISuggestionRepo suggestionRepo;
	
	@Autowired
	ConvertedSuggestions conSuggestions;

	@Override
	public SuggestionsDto addSuggestions(Suggestions suggestions) {
		// TODO Auto-generated method stub
	     Suggestions suggestion = suggestionRepo.save(suggestions);
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

	}
