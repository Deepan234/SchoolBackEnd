package com.project.school.standard.service;

import java.util.List;

import com.project.school.standard.beans.School;
import com.project.school.standard.mapstruct.dto.SchoolDto;

public interface ISchoolService {

	SchoolDto addSchool(School school);

	SchoolDto updateSchool(School school);

	SchoolDto getSchool(int id);

	List<School> getAllSchool();

	String deleteSchool(int id);
	

}
