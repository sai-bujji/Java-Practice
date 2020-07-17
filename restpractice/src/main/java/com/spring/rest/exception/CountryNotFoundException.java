package com.spring.rest.exception;

public class CountryNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CountryNotFoundException(String exception) {
	    super(exception);
	    System.out.println("-------------inside CountryNotFoundException constructer--------");
	  }

}
