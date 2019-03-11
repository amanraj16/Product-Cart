package com.capgemini.exceptions;

public class ProductIdDoesNotExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductIdDoesNotExistException(String msg)
	{
		super(msg);
	}
}
