package com.project.school.standard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.school.standard.beans.Admin;
import com.project.school.standard.mapstruct.dto.AdminDto;
import com.project.school.standard.service.IAdminService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AdminController {
	
	@Autowired
	IAdminService service;
	
	
	@PostMapping("/login")
	public ResponseEntity<AdminDto> Login(@RequestBody Admin admin){
		AdminDto adminDto = service.validateLogin(admin.getUserName(),admin.getPassword());
		return new ResponseEntity<AdminDto>(adminDto,HttpStatus.OK);
	}

}
