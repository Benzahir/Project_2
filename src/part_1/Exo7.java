package part_1;

import java.util.Scanner;

public class Exo7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Input weight in pounds :");
		 float weight = sc.nextInt();
		 System.out.println("Input height in inches :");
		 float height = sc.nextInt();
		 float bmi = 703*weight/((height)*height);
		 System.out.printf("Body Mass Index is %.14f ",bmi);

	}

}
