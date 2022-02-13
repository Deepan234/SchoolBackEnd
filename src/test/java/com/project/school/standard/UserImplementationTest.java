package com.project.school.standard;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.school.standard.beans.User;
import com.project.school.standard.mapstruct.convertutils.ConvertedUser;
import com.project.school.standard.mapstruct.dto.UserDto;
import com.project.school.standard.repo.IUserRepo;
import com.project.school.standard.service.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
class UserImplementationTest {

	
	@Mock
	IUserRepo userRepo;
	
	@Mock
	User user;
	
	@Mock
	UserDto userDto;
	
	
	@Mock
	ConvertedUser conUser;
	
	@InjectMocks
	UserServiceImpl service;
	
	@Test
	void testCreateUser() {
        
		when(userRepo.save(user)).thenReturn(user);
		when(conUser.convertUsertoUserDto(user)).thenReturn(userDto);
		
		UserDto userDtonew = service.createUser(user);
		
		assertEquals(userDtonew,userDto);
				
	}

}
