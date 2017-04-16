package miscellaneous;

import java.util.Scanner;

public class Calculator {

	  
    int result=0;
    
    public int add(int n1, int n2)
    {
    result=n1+n2;
    return result;
    }
    
     public int sub(int n1, int n2)
    {
    result=n1-n2;
    return result;
    }
     
      public int mul(int n1, int n2)
    {
    result=n1*n2;
    return result;
    }
      
       public double div(int n1, int n2)
    {
    result=n1/n2;
    return result;
    }
       
        public int rem(int n1, int n2)
    {
    result=n1%n2;
    return result;
    }
        
       public static void main(String[] args) {
        int choice,n1=0,n2=0;
        double result;
        
        Calculator c = new Calculator();
        Scanner s = new Scanner(System.in);
        
        System.out.println("*** Menu Driven Calculator ***");
        System.out.println("1. Addition");
        System.out.println("2. Subtration");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.println("6. Exit");
        System.out.println("**********************");
        System.out.println("Please enter the operation to be formed:");
        choice = s.nextInt();
        
        System.out.println("Enter the two numbers: ");
        n1= s.nextInt();
        n2= s.nextInt();
        
        switch(choice)
        {
        case 1:
            result = c.add( n1, n2); 
            System.out.println("Addition is: "+result);
            break;
            
        case 2: 
            result = c.sub(n1, n2);
            System.out.println("Subtraction is: " +result);
            break;
            
        case 3: 
            result = c.mul(n1, n2);
            System.out.println("Product is: "+result);
            break;
            
        case 4: 
            result = c.div(n1, n2);
            System.out.println("Quotient is: "+result);
            break;
            
        case 5: 
            result = c.rem(n1, n2);
            System.out.println("Remainder is: "+result);
            break;  
            
        case 6:
            System.out.println("Exit");
            System.exit(0);
            break;
            
        default:System.out.println("Invalid choice. Enter again");
         
        
        }
}

}


