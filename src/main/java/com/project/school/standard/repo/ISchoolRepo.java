package com.project.school.standard.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.school.standard.beans.School;

public interface ISchoolRepo extends JpaRepository<School,Integer>{

}
