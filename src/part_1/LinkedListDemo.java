package part_1;

import java.util.Comparator;
import java.util.LinkedList;

 

public class LinkedListDemo {

	public static void main(String[] args) {
		 LinkedList<Integer> list = new LinkedList<Integer>();
		 
		 list.add(5);
		 list.add(556);
		 list.add(0);
		 list.add(10);
		 System.out.println("the size of this list is : "+list.size());
		 System.out.println("before sorting :"+list);
		 //list.sort(Comparator.reverseOrder());
		 list.sort(Comparator.naturalOrder());
		 System.out.println("after sorting :"+list);
		 
		 

	}

}
