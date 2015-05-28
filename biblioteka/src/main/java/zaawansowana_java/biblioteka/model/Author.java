package zaawansowana_java.biblioteka.model;

import java.sql.Date;

public class Author {
	private String name;
	private String lastName;
	//type Date sql
	private Date dateOfBirth;
	private Date dateOfDeath;
	
	public Author(String name, String lastName, Date dateOfBirth,
			Date dateOfDeath) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfDeath = dateOfDeath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfDeath() {
		return dateOfDeath;
	}

	public void setDateOfDeath(Date dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	@Override
	public String toString() {
		return "Author :" + getName() + " "+ getLastName() 
				+ ", date of birth: " + getDateOfBirth()
				+ ", date of death: " + getDateOfDeath();
	}
	
		
}
