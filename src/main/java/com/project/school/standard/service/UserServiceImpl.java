package com.project.school.standard.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.school.standard.beans.User;
import com.project.school.standard.mapstruct.convertutils.ConvertedUser;
import com.project.school.standard.mapstruct.dto.UserDto;
import com.project.school.standard.repo.IUserRepo;

public class UserServiceImpl implements IUserService {

	@Autowired
	IUserRepo userRepo;
	
	@Autowired
	ConvertedUser userThing;
	
	@Override
	public UserDto createUser(User user) {
		// TODO Auto-generated method stub
		User userDetails = userRepo.save(user);
		return userThing.convertUsertoUserDto(userDetails);
	}

}
