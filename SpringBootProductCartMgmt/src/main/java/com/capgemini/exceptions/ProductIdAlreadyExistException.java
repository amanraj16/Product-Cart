package com.capgemini.exceptions;

public class ProductIdAlreadyExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductIdAlreadyExistException(String msg)
	{
		super(msg);
	}
}
