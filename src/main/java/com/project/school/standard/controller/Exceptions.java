package com.project.school.standard.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.project.school.standard.exceptions.InvalidInputException;

@ControllerAdvice
public class Exceptions {
	
	@ExceptionHandler(value = InvalidInputException.class)
	public ResponseEntity<Object> exceptionInvalidInputException(InvalidInputException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_ACCEPTABLE);
	}

}
