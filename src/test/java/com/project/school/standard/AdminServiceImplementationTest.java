package com.project.school.standard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.school.standard.beans.Admin;
import com.project.school.standard.mapstruct.convertutils.ConvertedAdmin;
import com.project.school.standard.mapstruct.dto.AdminDto;
import com.project.school.standard.repo.IAdminRepo;
import com.project.school.standard.service.AdminServiceImpl;



@ExtendWith(MockitoExtension.class)
class AdminServiceImplementationTest {

	@Mock
	IAdminRepo adminRepo;
	
	@InjectMocks
	AdminServiceImpl service;
	
	@Mock
	ConvertedAdmin conAdmin;
	

	@Mock
	Admin admin;
	
	@Mock
	AdminDto adminDto;
	
	
	@Test
	void testValidateLogin() {
	      when(adminRepo.validateLogin("shreya@gmail.com","Shreya@13")).thenReturn(admin);
	      when(conAdmin.convertAdmintoAdminDto(admin)).thenReturn(adminDto);
	      AdminDto adminDtoservice = service.validateLogin("shreya@gmail.com","Shreya@13");
	      assertEquals(adminDto,adminDtoservice);
	      verify(adminRepo).validateLogin("shreya@gmail.com","Shreya@13");
	      verify(conAdmin).convertAdmintoAdminDto(any(Admin.class));
	}

}

