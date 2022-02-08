package com.project.school.standard.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.school.standard.beans.User;


public interface IUserRepo extends JpaRepository<User, String> {

}
