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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.school.standard.beans.School;
import com.project.school.standard.mapstruct.dto.SchoolDto;
import com.project.school.standard.service.ISchoolService;

@RestController
@RequestMapping("/school")
@CrossOrigin
public class SchoolController {
	
	@Autowired
	ISchoolService service;

	@PostMapping("/addschool")
	public ResponseEntity<SchoolDto> addSchool(@RequestBody School school){
		
		SchoolDto schoolDto = service.addSchool(school);
		return new ResponseEntity<SchoolDto>(schoolDto,HttpStatus.OK); 
		
   	}
	
	
	@PutMapping("/updateschool")
	public ResponseEntity<SchoolDto> updateSchool(@RequestBody School school){
        
		SchoolDto schoolDto = service.updateSchool(school);
		return new ResponseEntity<SchoolDto>(schoolDto,HttpStatus.OK);
	}
	
	@GetMapping("/getSchool/{id}")
	public ResponseEntity<SchoolDto> getSchool(@PathVariable int id){
         
		SchoolDto schoolDto = service.getSchool(id);
		return new ResponseEntity<SchoolDto>(schoolDto,HttpStatus.OK);
	}

	
	@GetMapping("/getallschool")
	public ResponseEntity<List<School>> getAllSchool(){
		List<School> school = service.getAllSchool();
		return new ResponseEntity<List<School>>(school,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteSchool(@PathVariable int id) {
		String message = service.deleteSchool(id);
		return message;
	}
}
