package com.cisc181.core;

public class PersonException extends Exception {
	private Person Person;
	public PersonException(){}
	
	public PersonException(String message){
		super(message);
	}
}
