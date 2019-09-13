package part_1;

import java.util.Scanner;

public class Exo9 {
	
	
	public static int F(int n) {
		
		if(n==0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		return F(n-1)+F(n-2);
	}
	 

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an interger : ");
		int num = sc.nextInt();
		System.out.println("the result of Fibonacci series :"+F(num));
	}

}
