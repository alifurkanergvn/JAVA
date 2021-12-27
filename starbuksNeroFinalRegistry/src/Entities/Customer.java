package Entities;

import Abstract.IEntites;

public class Customer implements IEntites {
	public int id ;
	public String firstName;
	public String lastName;
	public int dateYear;
	public String nationalIdString;
	
public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, int dateYear, String nationalIdString) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateYear = dateYear;
		this.nationalIdString = nationalIdString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateYear() {
		return dateYear;
	}

	public void setDateYear(int dateYear) {
		this.dateYear = dateYear;
	}

	public String getNationalIdString() {
		return nationalIdString;
	}

	public void setNationalIdString(String nationalIdString) {
		this.nationalIdString = nationalIdString;
	}
	

}
