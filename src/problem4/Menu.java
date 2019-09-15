package problem4;

 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	public  List<String> list ;
	
	public Menu(){
		list= new ArrayList<>(); 
	}
  public  void menu() {
	  System.out.println("----------------------------------------------------------");
	  System.out.println("Johner Institut CRM");
	  System.out.println("----------------------------------------------------------");
	  System.out.println("Bitte wählen Sie eine der folgenden Optionen \n");
	  System.out.println("[1] Kunde erfassen");
	  System.out.println("[2] Liste aller Kunden ausgeben");
	  
  }
	
  public void erfassen(String a) {	
		  list.add(a);
	   
  }

public  List<String> getList() {
	return list;
}
  
  

  
  

	
}
