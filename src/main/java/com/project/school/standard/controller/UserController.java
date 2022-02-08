package com.project.school.standard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.project.school.standard.mapstruct.dto.UserDto;
import com.project.school.standard.service.IUserService;
import com.project.school.standard.beans.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IUserService service;
	
	@PostMapping("/add")
	public ResponseEntity<UserDto> createUser(@RequestBody User user){
		UserDto userDto = service.createUser(user);
		return new ResponseEntity<UserDto>(userDto,HttpStatus.OK);
	}
	

}
