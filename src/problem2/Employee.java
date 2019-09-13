package problem2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="employee")
@XmlAccessorType(XmlAccessType.PROPERTY)


public class Employee {
  private String firstName;
  private String lastName;
  private String location;
  
  
  
public Employee(String firstName, String lastName, String location) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.location = location;
}

public Employee() {
	super();
	}
public final String getFirstName() {
	return firstName;
}

public final void setFirstName(String firstName) {
	this.firstName = firstName;
}

public final String getLastName() {
	return lastName;
}

public final void setLastName(String lastName) {
	this.lastName = lastName;
}

public final String getLocation() {
	return location;
}

public final void setLocation(String location) {
	this.location = location;
}

@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", location=" + location + "]";
}


  
  
  
}
