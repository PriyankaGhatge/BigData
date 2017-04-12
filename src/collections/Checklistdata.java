package collections;

import java.util.LinkedList;
import java.util.List;

public class Checklistdata {
	
	
		public static void main(String[] args) {
			LinkedList<String> mydata = new LinkedList<String>();
			mydata.add("First");
			mydata.add("Second");
			mydata.add("Third");
			
			List<String> listdata= new LinkedList<String>();
			System.out.println("Does Linkedlist contain all elements ?"+mydata.containsAll(listdata));
			listdata.add("one");
			System.out.println("Does Linkedlist contain all elements ?"+mydata.containsAll(listdata));
		
	}

}
