package part_1;

import java.util.Arrays;

public class Exo8 {

	public static void main(String[] args) {
		
		int arr[]= {5,2,3,8,0};
		
		Arrays.sort(arr);
		System.out.printf("Modified arr[] : %s",Arrays.toString(arr));
		/*int temp=0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length; j++) {
				
			}
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}

		for (int i : arr) {
			System.out.println(i);
		}
		*/
		System.out.println(Integer.MAX_VALUE);
     
	}

}
