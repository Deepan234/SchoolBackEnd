package com.project.school.standard;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.school.standard.beans.Suggestions;
import com.project.school.standard.mapstruct.convertutils.ConvertedSuggestions;
import com.project.school.standard.mapstruct.dto.SuggestionsDto;
import com.project.school.standard.repo.ISchoolRepo;
import com.project.school.standard.repo.ISuggestionRepo;
import com.project.school.standard.service.SuggestionServiceImpl;


@ExtendWith(MockitoExtension.class)
class SuggestionServiceImplementationTest {

	
	@Mock
	Suggestions suggestion;
	
	@Mock
	SuggestionsDto suggestionDto;
	
	@InjectMocks
	SuggestionServiceImpl service;
	
	@Mock
	ISuggestionRepo suggestionRepo;
	
	
	@Mock
	ConvertedSuggestions conSuggestion;
	
	@Mock
	List<Suggestions> suggestionList;
	
	
	@Mock
	ISchoolRepo schoolRepo;
	
//	@Test
//	void testAddSuggestions() {
//		
//         
//       Suggestions sugg = new Suggestions(40,"Neelima","neelima@gmail.com","Sreya School","Vijayawada","9999933333","sreya@gmail.com","CBSE","Its wonderful school tell by themselves"); 		
//	   
//       SuggestionsDto suggDto = conSuggestion.convertSuggestionsToSuggestionDto(sugg);
//       
//       SuggestionsDto suggDtonew = service.addSuggestions(sugg);
//       
//       assertEquals(suggDto,suggDtonew);
//		
//	}

	@Test
	void testGetAllSuggestions() {
		when(suggestionRepo.findAll()).thenReturn(suggestionList);
		List<Suggestions> suggestionLister = service.getAllSuggestions();
		assertEquals(suggestionList,suggestionLister);
		verify(suggestionRepo).findAll();
	}

	@Test
	void testGetSuggestionById() {
		int id = suggestion.getId();
		when(suggestionRepo.getById(id)).thenReturn(suggestion);
		when(conSuggestion.convertSuggestionsToSuggestionDto(suggestion)).thenReturn(suggestionDto);
		SuggestionsDto suggestionsDto = service.getSuggestionById(id);
		assertEquals(suggestionDto,suggestionsDto);
		verify(suggestionRepo).getById(id);
		verify(conSuggestion).convertSuggestionsToSuggestionDto(suggestion);
	}

	@Test
	void testDeleteSuggestion() {
	     int id = suggestion.getId();
	 	when(suggestionRepo.getById(id)).thenReturn(suggestion);
		String deleteStatement = "Deleted Sucessfuly";
		String delete = service.deleteSuggestion(id);
		assertEquals(deleteStatement,delete);
	}

}
