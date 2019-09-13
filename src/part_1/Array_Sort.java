package part_1;

import java.util.Arrays;

public class Array_Sort {
	private static int arr[]={19,2,3,6,201,23,43,99,54,778,889,123,54};

	public static void main(String[] args) {
		System.out.printf("Array vor der Sortierung : %s \n",Arrays.toString(arr));
		 Arrays.sort(arr);
		 System.out.printf("Array nach der Sortierung : %s", Arrays.toString(arr));
		

	}

}
