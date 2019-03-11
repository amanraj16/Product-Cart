package com.capgemini.exceptions;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ProductExceptionHandler {
	
	@ExceptionHandler(value = ProductIdDoesNotExistException.class)
	public ResponseEntity<Object> productIDDoesNotExistException(ProductIdDoesNotExistException e)
	{
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value = ProductIdAlreadyExistException.class)
	public ResponseEntity<Object> ProductIDAlreadyExistException(ProductIdAlreadyExistException e)
	{
		return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
	}

}
