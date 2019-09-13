package part_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {
	
	//public String s1;
	//public String s2;
	
	public static boolean anagram(String s1, String s2) {

		List<String> l1 = Arrays.asList(s1.split(""));
		List<String> l2 = Arrays.asList(s2.split(""));
		
		TreeSet<String> list1 = new TreeSet<String>();
		TreeSet<String> list2 = new TreeSet<String>();
		
		list1.addAll(l1);		
		list2.addAll(l2);
		
		return list1.equals(list2);
		
	
	
	}
	
	

	public static void main(String[] args) {
		  //System.out.println(anagram("arimy","mary"));
		
	    TreeSet<String> li=new TreeSet<>();
		  
		System.out.println(li.add("a"));
		System.out.println(li.add("a"));
		 
		
		
	

	}

}
