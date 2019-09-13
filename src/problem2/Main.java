package problem2;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import problem2.Employees;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:/Users/hp/eclipse-workspace/Exercices-Java/src/problem2/emp.xml");
		JAXBContext jaxbContext;
		try
		{
		    jaxbContext = JAXBContext.newInstance(Employees.class);             
		 
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 
		    Employees empl = (Employees) jaxbUnmarshaller.unmarshal(file);
		     
		    System.out.println(empl);
		}
		catch (JAXBException e)
		{
		    e.printStackTrace();
		}

	}

}
