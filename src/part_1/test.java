package part_1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "abdou";
		String temp;
		
		//String arr[] = null;
		
		for(int i=0;i<a.length();i++) {
			String arr[] = a.split("");
			for(int j=i+1;j<i+2;j++) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			System.out.println(arr);
			
			
		}
		
	}

}
