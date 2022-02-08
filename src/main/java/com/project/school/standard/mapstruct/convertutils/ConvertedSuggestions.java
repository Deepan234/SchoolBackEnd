package com.project.school.standard.mapstruct.convertutils;

import org.springframework.stereotype.Component;

import com.project.school.standard.beans.Suggestions;
import com.project.school.standard.mapstruct.dto.SuggestionsDto;

@Component
public class ConvertedSuggestions {
	
	public SuggestionsDto convertSuggestionsToSuggestionDto(Suggestions suggestion) {
		
		SuggestionsDto suggestionDto = new SuggestionsDto();
		suggestionDto.setAbout(suggestion.getAbout());
		suggestionDto.setAffliation(suggestion.getAffliation());
		suggestionDto.setContactNo(suggestion.getContactNo());
		suggestionDto.setEmail(suggestion.getEmail());
		suggestionDto.setId(suggestion.getId());
		suggestionDto.setName(suggestion.getName());
		suggestionDto.setSchoolAddress(suggestion.getSchoolAddress());
		suggestionDto.setSchoolEmailId(suggestion.getSchoolEmailId());
		suggestionDto.setSchoolName(suggestion.getSchoolName());
		
		return suggestionDto;
		
	}
	
   public Suggestions convertSuggestionDtoToSuggestion(SuggestionsDto suggestionDto) {
	   Suggestions suggestion = new Suggestions();
	   suggestion.setAbout(suggestionDto.getAbout());
		suggestion.setAffliation(suggestionDto.getAffliation());
		suggestion.setContactNo(suggestionDto.getContactNo());
		suggestion.setEmail(suggestionDto.getEmail());
		suggestion.setId(suggestionDto.getId());
		suggestion.setName(suggestionDto.getName());
		suggestion.setSchoolAddress(suggestionDto.getSchoolAddress());
		suggestion.setSchoolEmailId(suggestionDto.getSchoolEmailId());
		suggestion.setSchoolName(suggestionDto.getSchoolName());
		
		return suggestion;
	   
   }
}
