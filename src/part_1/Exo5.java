package part_1;

import java.util.Scanner;

public class Exo5 {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input the number of minutes: ");
		float x = s.nextFloat();
		float y = (x/525600);
		
		int a = ((int)x/525600);
		float b = y-a;
		float d = b*365;
		
		
		System.out.println(x+"minutes is approximately "+(int)y+" years and "+(int)d+" days");
		//System.out.printf("%f",b);
		
		
		 
	}

}
