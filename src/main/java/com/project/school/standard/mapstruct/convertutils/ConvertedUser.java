package com.project.school.standard.mapstruct.convertutils;

import org.springframework.stereotype.Component;

import com.project.school.standard.beans.User;

import com.project.school.standard.mapstruct.dto.UserDto;

@Component
public class ConvertedUser {
	
	public UserDto convertUsertoUserDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setEmailId(user.getEmailId());
		userDto.setGender(user.getGender());
		userDto.setPassword(user.getPassword());
		userDto.setPhoneNo(user.getPhoneNo());
		userDto.setUserName(user.getUserName());
		
		return userDto;
	}

	public User convertUserDtotoUser(UserDto userDto) {
		User user = new User();
		user.setEmailId(userDto.getEmailId());
		user.setGender(userDto.getGender());
		user.setPassword(userDto.getPassword());
		user.setPhoneNo(userDto.getPhoneNo());
		user.setUserName(userDto.getUserName());
       
		return user;
	}
	
}
