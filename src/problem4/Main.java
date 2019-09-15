package problem4;

import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {

		Menu m = new Menu();
		Kunden k= new Kunden();

		m.menu();
		// choice();
		k.cases(m);

	}

}
