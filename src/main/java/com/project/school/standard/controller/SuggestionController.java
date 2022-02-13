package com.project.school.standard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.school.standard.beans.Suggestions;
import com.project.school.standard.mapstruct.dto.SchoolDto;
import com.project.school.standard.mapstruct.dto.SuggestionsDto;
import com.project.school.standard.service.ISuggestionService;

@RestController
@CrossOrigin
@RequestMapping("/suggestion")
public class SuggestionController {
	
	@Autowired
	ISuggestionService service;
	
	@PostMapping("/addSuggestions")
	public ResponseEntity<SuggestionsDto> addSuggestions(@RequestBody Suggestions suggestions) {
		
		SuggestionsDto suggestionsDto = service.addSuggestions(suggestions);
		return new ResponseEntity<SuggestionsDto>(suggestionsDto,HttpStatus.OK);  
		
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Suggestions>> getAllSuggestions(){
		
		List<Suggestions> suggestionList = service.getAllSuggestions();
		return new ResponseEntity<List<Suggestions>>(suggestionList,HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
   	public ResponseEntity<SuggestionsDto> getSuggestionsById(@PathVariable int id){
   		SuggestionsDto suggestionsDto = service.getSuggestionById(id);
   		return new ResponseEntity<SuggestionsDto>(suggestionsDto,HttpStatus.OK);
   	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteSuggestions(@PathVariable int id) {
		String message = service.deleteSuggestion(id);
		return message;
	}

}
