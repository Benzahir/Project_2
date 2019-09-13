package part_1;

public class Test1Type<T> {
	
	public T arr[];
	
  public Test1Type(T[] arry) {
		arr = arry;
	}

public   void permutation(T arr[]) {
		
		int len=arr.length;
		T k=(T)"" ;
		for(int i=0; i<len; i++) {
			k=arr[i];
			for(int j=i+1; j<len; j++) {
				if(k==arr[j]) {
					
					arr[j]=(T)"";
					
					 
				}
				
			}
		}
		for(T s : arr) {
			System.out.print(" "+s);
		}
	}
	

}
