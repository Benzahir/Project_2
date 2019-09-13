package part_1;

import java.util.Scanner;

public class Exo2 {
	private static int x;
	private static  int y;
	private static int sum;

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("The first numbre is :");
		x= s.nextInt();
		System.out.println("The second numbre is :");
		y= s.nextInt();
		sum=x+y;
		//sum=x/y;
		System.out.println("The sum of the two numbers is :"+sum);
	}

}
