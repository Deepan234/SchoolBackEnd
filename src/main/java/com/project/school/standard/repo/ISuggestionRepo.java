package com.project.school.standard.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.school.standard.beans.Suggestions;

public interface ISuggestionRepo extends JpaRepository<Suggestions,Integer> {
	
	

}
