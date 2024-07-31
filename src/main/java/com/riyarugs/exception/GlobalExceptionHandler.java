package com.riyarugs.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	 
	@ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<ErrorResponse> handleGlobalException(Exception e){
		ErrorResponse errorResponse = new ErrorResponse(0, null);
		errorResponse.setMessage(e.getMessage());
		errorResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
 		
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}
}
