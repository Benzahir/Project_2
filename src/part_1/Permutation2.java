package part_1;

public class Permutation2 {
	//public  static  String word;
	 public static int fact (int n) {
	        if (n==0) return(1);
	        else return(n*fact(n-1));
	    }
   
   
   public static String  perm(String word) {
	
	   for(int i=0; i<word.length();i++) {
			for(int j=i; j<fact(word.length()-1);j++) {
				
				String t1= word.substring(j+1,j+2);
				String t2= word.substring(word.length()-1,word.length());
				
				String temp=t1;
				t1=t2;
				t2=temp;
				word=word.charAt(i+1)+t1+t2;
				return word;
				
				
			}
			 
		}
		return word;

   }

	public static void main(String[] args) {
		
	System.out.println("permutation for this word are : \n"+perm("BENZ"));
			

	}

}
