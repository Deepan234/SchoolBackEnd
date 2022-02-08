package com.project.school.standard.service;

import java.util.List;

import com.project.school.standard.beans.Suggestions;
import com.project.school.standard.mapstruct.dto.SuggestionsDto;

public interface ISuggestionService {

	SuggestionsDto addSuggestions(Suggestions suggestions);

	List<Suggestions> getAllSuggestions();
	
	SuggestionsDto getSuggestionById(int id);

	String deleteSuggestion(int id);


}
