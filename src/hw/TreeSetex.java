package hw;

import java.util.TreeSet;

public class TreeSetex {

	public static void main(String[] args) {
		
		
		TreeSet<Employee> emp = new TreeSet<Employee>(); 
		
        emp.add(new Employee("Sreeram", 101, 45));
        emp.add(new Employee("Karthik", 103, 23));
        emp.add(new Employee("Ram", 102, 32));
        emp.add(new Employee("Yusmitha", 105, 29));
        emp.add(new Employee("Bhavya", 104, 60));
        
       System.out.println(emp); 
       TreeSet newemp = (TreeSet) emp.clone();
    
    }
}

class Employee implements Comparable<Employee>
{
    String name;
    int id;
    int age;
    
    public Employee(String name, int id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    
    public String toString()
    {
        return name + " " + id + " " + age;
    }
    
    public int compareTo(Employee o)
    {
    
        return id - o.id;
    }
	}

	


