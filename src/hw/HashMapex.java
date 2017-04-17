package hw;

import java.util.HashMap;
import java.util.Map;


public class HashMapex {
	
	public static void main(String[] args) {
		
	
	HashMap<Integer, Employee> empDetails = new HashMap<Integer,Employee>();
	
	Employee e1 = new Employee("Govind",25000,23);
	Employee e2 = new Employee("Purab",55000,32);
	Employee e3 = new Employee("Sayli",35000,25);
	Employee e4 = new Employee("Atul",100000,45);
	Employee e5 = new Employee("Sneha",50000,30);
	
	empDetails.put(1, e1);
	empDetails.put(2, e2);
	empDetails.put(3, e3);
	empDetails.put(4, e4);
	empDetails.put(5, e5);
	
	for(Map.Entry<Integer, Employee>data :empDetails.entrySet()){
		int key = data.getKey();
		Employee e = data.getValue();
		
		System.out.println("Name is "+e.name);
		System.out.println("Salary is "+e.id);
		System.out.println("Age is "+e.age);
		}
	
	empDetails.remove(3);
	for(Map.Entry<Integer, Employee>data :empDetails.entrySet()){
		int key = data.getKey();
		Employee e = data.getValue();
		System.out.println("------------------------------");
		System.out.println("Name is "+e.name);
		System.out.println("Salary is "+e.id);
		System.out.println("Age is "+e.age);
		}
	
	empDetails.replace(3, e4);
	System.out.println("Records after replacing"+empDetails);
	
	
	class Employee{
		private String name;
		private int sal;
		private int age;
		   
		    
		    public Employee(String name, int sal, int age)
		    {
		        this.name = name;
		        this.sal = sal;
		        this.age = age;
		    }
		    
		    public String toString()
		    {
		        return name + " " + sal + " " + age;
		    }
		}
	
}
}