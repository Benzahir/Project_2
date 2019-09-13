package problem1;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

enum Products {
	Candy(10), Snack(50), Nuts(90), Coke(25), Pepsi(35), Soda(45);
	private int price;

	private Products(int pr) {
		price = pr;
	}

	public int getPrice() {
		return price;
	}

}

enum Option {
	Cancel, Reset, Returnpro;
}

public class Vending_Machine {
	static Products pro;
	static Option op;
	public static int money;
	public static int rest;

	public Vending_Machine(Products protype, Option optype, int m, int r) {

		this.pro = protype;
		this.op = optype;
		this.money = m;
		this.rest = r;
	}
	

	

	public static void menu() {

		System.out.println("------ Menu ------");
		System.out.println("1- Candy " );
		System.out.println("2- Snack " );
		System.out.println("3- Nuts " );
		System.out.println("3- Coke " );
		System.out.println("4- Pepsi " );
		System.out.println("5- Soda " + Products.Soda);
		System.out.println("7- Cancel " + Option.Cancel);
		System.out.println("8- Reset " + Option.Reset);
	 
	}
	
	public static int f() {
		menu();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a number from the menu");
		return  sc.nextInt();
	}
	
	public static void t() {
		boolean b=false;
		switch (f()) {//System.out.println("Vending Machine accepts coins of 1,5,10,25, 50 Cents");
		case 1:
			System.out.println("Your product is Candy.This product costs " + pro.Candy.getPrice() + " cents");
			 Scanner mn = new Scanner(System.in);
			System.out.println("Put the money in the machine please !");
				money=mn.nextInt();
			 
		
			
			if(money==1 || money==5 || money==10 || money==25 || money==50) {
				if (money > pro.Candy.getPrice()) {
					rest = money - pro.Candy.getPrice();
					System.out.println("Your remaining change is " + rest + " cents \n Take your product please ");
				}
				if (money == pro.Candy.getPrice()) {
					rest = 0;
					System.out.println("Your remaining change is "+ rest + " cents \n Take your product please");
				}
				if (money < pro.Candy.getPrice()) {
					System.out.println("error : not enough money !");
				}
			}
			else {
				System.out.println("Vending Machine accepts coins of 1,5,10,25, 50 Cents");
			}
			System.out.println("Do you need other products ? (y/n)");
			Scanner s= new Scanner(System.in);
				if(s.next().equals("y") ) {
					t();
				}
				 
			 
			
				
				
			
			
			
			
			break;
		case 2:
			System.out.println("Your product is Snack");
			break;
		case 3:
			System.out.println("Your product is Nuts");
			break;
		case 4:
			System.out.println("Your product is Coke");
			break;
		case 5:
			System.out.println("Your product is Pepsi");
			break;
		case 6:
			System.out.println("Your product is Soda");
			break;
		case 7:
			System.out.println("Your operation is cancelled ! take your money please  ");
			break;
		case 8:
			t();
			break;
		

		}
	}
	public static void main(String[] args) {

		t();

	}
}
