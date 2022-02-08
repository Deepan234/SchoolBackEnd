package com.project.school.standard.mapstruct.convertutils;

import org.springframework.stereotype.Component;

import com.project.school.standard.beans.Admin;
import com.project.school.standard.mapstruct.dto.AdminDto;

@Component
public class ConvertedAdmin {
	
	
	public AdminDto convertAdmintoAdminDto(Admin admin) {
		
		AdminDto adminDto = new AdminDto();
		adminDto.setUserName(admin.getUserName());
		adminDto.setPassword(admin.getPassword());
		
		return adminDto;
		
	}
	
	public Admin convertAdminDtotoAdmin(AdminDto adminDto) {
		Admin admin = new Admin();
		admin.setUserName(adminDto.getUserName());
		admin.setPassword(adminDto.getPassword());
		return admin;
	}
	

}
