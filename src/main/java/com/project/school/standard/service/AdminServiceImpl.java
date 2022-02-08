package com.project.school.standard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.school.standard.beans.Admin;
import com.project.school.standard.exceptions.InvalidInputException;
import com.project.school.standard.mapstruct.convertutils.ConvertedAdmin;
import com.project.school.standard.mapstruct.dto.AdminDto;
import com.project.school.standard.repo.IAdminRepo;

@Service("service")
public class AdminServiceImpl implements IAdminService {
	
	
	@Autowired
	IAdminRepo adminRepo;
	
	@Autowired 
	ConvertedAdmin convertedAdmin;

	@Override
	public AdminDto validateLogin(String userName, String password) {
		// TODO Auto-generated method stub
//		password = Integer.valueOf(password.hashCode()).toString();
		Admin admin = adminRepo.validateLogin(userName, password);
		
		if (admin == null) {
			throw new InvalidInputException("Wrong Credentials");
		} else {
			return convertedAdmin.convertAdmintoAdminDto(admin);
		}
	}

}
