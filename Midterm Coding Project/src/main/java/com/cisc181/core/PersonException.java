package com.cisc181.core;

public class PersonException extends Exception {
	
	Person person;
	
	 public PersonException() {
	    }
	public PersonException(Person person) {
		super();
		this.person = person;
	}
	
	public Person getPerson() {
		return person;
	}

}

