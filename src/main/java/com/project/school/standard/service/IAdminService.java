package com.project.school.standard.service;

import com.project.school.standard.mapstruct.dto.AdminDto;

public interface IAdminService {

	AdminDto validateLogin(String userName, String password);

}
