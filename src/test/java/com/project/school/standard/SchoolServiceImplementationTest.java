package com.project.school.standard;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.school.standard.beans.School;
import com.project.school.standard.mapstruct.convertutils.ConvertedSchool;
import com.project.school.standard.mapstruct.dto.SchoolDto;
import com.project.school.standard.repo.ISchoolRepo;
import com.project.school.standard.service.SchoolServiceImpl;


@ExtendWith(MockitoExtension.class)
class SchoolServiceImplementationTest {

	
	@Mock
	ISchoolRepo schoolRepo;
	
	@InjectMocks
	SchoolServiceImpl service;
	
	@Mock
	School school;
	
	@Mock
	SchoolDto schoolDto;
	

	@Mock
	ConvertedSchool conSchool;
	
	@Mock
	List<School> schoolList;
		

	@Test
	void testAddSchool() {
       
		
		School schoolnew = new School(31,"Sandesh school","Very Good school","Hyderabad","9789269680","20Kms","sandesh@gmail.com","10000","cbse","5","www.sandesh.com");
		
		SchoolDto schoolDto = conSchool.convertSchooltoSchoolDto(schoolnew);
		
		SchoolDto schoolDtoservice = service.addSchool(schoolnew);
	    
		assertEquals(schoolDto,schoolDtoservice);
	}

	@Test
	void testUpdateSchool() {
        School schoolnew = new School(31,"Sandesh school","Very Good school","Hyderabad","9789269680","25Kms","sandesh@gmail.com","10000","cbse","5","www.sandesh.com");
		
		SchoolDto schoolDto = conSchool.convertSchooltoSchoolDto(schoolnew);
		
		SchoolDto schoolDtoservice = service.updateSchool(schoolnew);
	    
		assertEquals(schoolDto,schoolDtoservice);

	}

	@Test
	void testGetSchool() {
		int id = school.getId();
		when(schoolRepo.getById(id)).thenReturn(school);
		when(conSchool.convertSchooltoSchoolDto(school)).thenReturn(schoolDto);
		SchoolDto schoolDtoservice = service.getSchool(id);
		assertEquals(schoolDto,schoolDtoservice);
		verify(schoolRepo).getById(id);
		verify(conSchool).convertSchooltoSchoolDto(any(School.class));
	}

	@Test
	void testGetAllSchool() {
		when(schoolRepo.findAll()).thenReturn(schoolList);
		List<School> schoolLister = service.getAllSchool();
		assertEquals(schoolLister,schoolList);
		verify(schoolRepo).findAll();
	}

	@Test
	void testDeleteSchool() {
		int id = school.getId();
		when(schoolRepo.getById(id)).thenReturn(school);
		String deleteStatement = "Deleted Sucessfully";
		String delete = service.deleteSchool(id);
		assertEquals(deleteStatement,delete);
	}

}
