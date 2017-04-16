package collections;

import java.util.Iterator;
import java.util.ArrayList;
 
 
public class ArrayListEx {

	public static void main(String[] args) {
		
ArrayList<String> emp = new ArrayList<String>();
		emp.add("Sam");
		emp.add("Dean");
		emp.add("Ruby");
		emp.add("Arun");
		emp.add("Sanjana");
		
		System.out.println(emp);
		
		Iterator itr = emp.iterator();	
		
		while (itr.hasNext()){
			System.out.println("Employee name is: " +itr.next());
		
			/*for(String o1:emp){
				System.out.println("Name is"+o1);
			}*/
		}

}
}
