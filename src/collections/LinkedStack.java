package collections;

import java.util.LinkedList;

public class LinkedStack {

	public static void main(String[] args) {
		LinkedList<String> mydata = new LinkedList<String>();
		mydata.add("First");
		mydata.add("Second");
		mydata.add("Third");

		System.out.println("Elements before push");
		System.out.println(mydata);
		mydata.push("Push");

		System.out.println("Elements after push");
		System.out.println(mydata);
		
		System.out.println("Elements before pop");
		mydata.pop();
		System.out.println(mydata);

	}

}
