package com.wiley.sbconcept.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import com.wiley.sbconcept.response.model.ErrorMessage;
@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler {
	@ExceptionHandler(DepNotFoundException.class)
	public ResponseEntity<ErrorMessage> depNotFoundException(
			DepNotFoundException exception, WebRequest request){
		ErrorMessage err = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
