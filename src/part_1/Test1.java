package part_1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
	

	
	 
	

	public static void main(String[] args) {
	
		//String[] cars = {"Volvo", "Volvo", "Volvo", "Volvo"};
		String[] cars = {"Volvo", "BMW", "BMW", "Mazda"};
		//permutation(cars);
		Test1Type<String> str = new Test1Type<>(cars);
		str.permutation(cars);
		

	}
	
	
	

}
