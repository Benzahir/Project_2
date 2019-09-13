package part_1;



public class ReversString {
	private   String s;
	private static String res="";
	
	public static String inPlacerevers(String s) {
		String arr[]=s.split("");
		 for(int i=0; i<s.length()-2; i++) {
		    
			String temp=arr[i];
		    arr[i]=arr[(arr.length-1)-i];
		    arr[(arr.length-1)-i]=temp;
		    
		    
		 }
		 for (String str : arr) {
				res+=str;
			}
		 return res;
	}
	
	public static void main(String[] args) {
		 
		
		System.out.println("new word is :"+inPlacerevers("bushra"));
	}

}
