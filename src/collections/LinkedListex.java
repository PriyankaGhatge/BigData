package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListex {
	
	

    public static void main(String[] aa)
    {
        LinkedList<String> Data = new LinkedList<String>();
        Data.add("E");
        Data.add("A");
        Data.add("C");
        Data.add("B");
        Data.add("D");
        Data.add("H");
        Data.add("W");
        Data.add("Q");
        Data.add("Y");
        
        ListIterator<String> itr = Data.listIterator();
        
        System.out.println("Inserting Order");
        
        while(itr.hasNext())
        {
            System.out.println("Data is : " + itr.next());
        }
        
        System.out.println("Reverse Order");
        while(itr.hasPrevious())
        {
            System.out.println("Data is : " + itr.previous());
        }
        
        Data.removeFirst();
        Data.removeLast();
        
        System.out.println("Removing first and last values: ");
        
       Iterator<String> itr1 = Data.iterator();
       while(itr.hasPrevious())
        {
            System.out.println("Data is : " + itr1.next());
        }
       Data.set(0, "test");
        System.out.println(Data);
    }
    
}

