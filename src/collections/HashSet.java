package collections;

public class HashSet {

	public static void main(String[] args) {
		
		java.util.HashSet<String> hobj = new java.util.HashSet<String>();
		hobj.add("sunday");
		hobj.add("monday");
		hobj.add("tuesday");
		hobj.add("wednesday");
		hobj.add("thursday");
		
		System.out.println("data display"+hobj);
		System.out.println("size after adding data"+hobj.size());
		
		hobj.remove("sunday");
		
		System.out.println("data display after removing"+hobj);
		System.out.println("size after removing data"+hobj.size());		
	
	}

}
