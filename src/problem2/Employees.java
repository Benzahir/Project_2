package problem2;
  

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.PROPERTY)


public class Employees {
	
	private List<Employee> employee;
	public Employees() {
		super();
	}

	public Employees(List<problem2.Employee> employee) {
		super();
		this.employee = employee;
	}

	public final List<Employee> getEmployee() {
		return employee;
	}

	public final void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Employees [employee=" + employee + "]";
	}
	
	
	 
	
	

}
