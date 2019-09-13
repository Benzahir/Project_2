package part_1;


import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
		 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the time zone offset to GMT:");
		int timeZoneChange = sc.nextInt();
		 
		long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
		
		
	}


