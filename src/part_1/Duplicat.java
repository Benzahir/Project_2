package part_1;

public class Duplicat {
 //public String word;
 public static int arr[]=null;
 private static int[] res;

  public static void duplcatword(int arr[]) {
	  int len=arr.length;
	  //res = null;
	  int k=0;
	  for(int i=0; i<len; i++) {
		  for(int j=1; j<len-1; j++) {
			  if(arr[i]!=arr[j]) {
				   //System.out.println(arr[i]);
				  res[k]+=arr[j];
				  								 
			  }	
			  
		  }
		  k++;
			
		}
	  for (int c : res) {
			System.out.println(c);
		}
		}
	 //return res;
	 
	public static void main(String[] args) {
		int arry[]={1,2,1,3,4,5};
	    duplcatword(arry);
		

	}

}
