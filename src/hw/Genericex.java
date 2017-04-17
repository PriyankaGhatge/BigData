package hw;

import java.util.Scanner;

public class Genericex {

	 
    public static void main(String[] args) {
        
    double sal;
    int age;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter age and salary of employee: ");
    
             age = sc.nextInt();
             sal = sc.nextDouble();
    Employee<Integer,Double> data = new Employee(age, sal);
    data.show();
      
    }
         
static class Employee<age,salary>{
            int age;
            double salary;


        public Employee(int age,double salary)
    {
        this.age = age;
        this.salary = salary;
    }

         void show()
    {
        
    System.out.println("Age is" +age);
    System.out.println("salary is "+salary);
   
    }

  }
}
