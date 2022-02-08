package com.project.school.standard.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.school.standard.beans.Admin;

public interface IAdminRepo extends JpaRepository<Admin,String> {
	
	@Query("select a from Admin a where a.userName = :userName and a.password = :password")
	public Admin validateLogin (@Param(value = "userName") String userName,
			@Param(value = "password") String password);

}
