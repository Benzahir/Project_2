package problem4;

import java.util.Scanner;

public class Kunden {
	public static int choice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a number from the menu");
		return sc.nextInt();
	}

	public static void cases(Menu m) {
		boolean end = false;

		do {
			switch (choice()) {
			case 1:
				Scanner sc = new Scanner(System.in);
				System.out.println("Input Your Name Please :");
				m.erfassen(sc.next());
				break;

			case 2:
				if(m.getList().isEmpty()) {
					System.out.println("Es gibt keine Kunden !");
				}
				else {

					for(String s:m.getList()) {
						System.out.println(s);
					}
					
				}

				break; 

			}
		} while (!end);

	}
}
