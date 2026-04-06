package com.educandoweb.maxvendas.resources;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.educandoweb.maxvendas.resources.exceptions.StandardError;
import com.educandoweb.maxvendas.services.exceptions.DatabaseException;
import com.educandoweb.maxvendas.services.exceptions.ResourcedNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourcedNotFoundException.class)
	public ResponseEntity<StandardError> resouceNotFound(ResourcedNotFoundException e, HttpServletRequest request){
		String error = "Resourced Not Found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database (DatabaseException e, HttpServletRequest request){
		String error = "Resourced Not Found";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}