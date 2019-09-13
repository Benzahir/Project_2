package part_1;

import java.util.Scanner;

public class Exo4 {
	
	private static int  x;
	private static int sum;
	
	

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Input an integer between 0 and 1000:");
	 x=sc.nextInt();
	 
	 int frdigit = x % 10;
	 int remainingNum = x/10;
	 int secdigit = remainingNum % 10;
	 remainingNum = remainingNum /10;
	 int thrdigit = remainingNum % 10;
	 sum= frdigit + secdigit + thrdigit;
	 
	 System.out.println("the sum of all digits in "+x+" is "+sum);
	 //}
	 
	 
	 
		

	}

}
