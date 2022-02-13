package com.project.school.standard.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.project.school.standard.exceptions.ContactNumberMismatchExceptions;
import com.project.school.standard.exceptions.EmailInputExceptions;
import com.project.school.standard.exceptions.InvalidInputException;
import com.project.school.standard.exceptions.SchoolNameMatchException;
import com.project.school.standard.exceptions.SchoolNameNotFoundExceptions;

@ControllerAdvice
public class Exceptions {
	
	@ExceptionHandler(value = InvalidInputException.class)
	public ResponseEntity<Object> exceptionInvalidInputException(InvalidInputException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler(value = SchoolNameNotFoundExceptions.class)
	public ResponseEntity<Object> exceptionSchoolNameNotFoundExceptions(SchoolNameNotFoundExceptions exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_ACCEPTABLE);
	}
	
	
	@ExceptionHandler(value = SchoolNameMatchException.class)
	public ResponseEntity<Object> exceptionSchoolNameMatch(SchoolNameMatchException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler(value = EmailInputExceptions.class)
	public ResponseEntity<Object> exceptionEmailInputExceptions(EmailInputExceptions exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler(value = ContactNumberMismatchExceptions.class)
	public ResponseEntity<Object> exceptionContactNumberMismatchExceptions(ContactNumberMismatchExceptions exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_ACCEPTABLE);
	}

}
