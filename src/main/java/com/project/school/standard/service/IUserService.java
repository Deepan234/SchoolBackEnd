package com.project.school.standard.service;

import com.project.school.standard.beans.User;
import com.project.school.standard.mapstruct.dto.UserDto;

public interface IUserService {

	UserDto createUser(User user);

}
