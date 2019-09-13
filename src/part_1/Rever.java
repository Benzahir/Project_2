package part_1;

public class Rever {
	
	public static void main(String[] args) {
		
		String s = "abdou";
		String result="";
		
		for(int i=s.length()-1;i>=0;i--) {
			result+=s.charAt(i); 
		}

		System.out.println(result);
	}

}
