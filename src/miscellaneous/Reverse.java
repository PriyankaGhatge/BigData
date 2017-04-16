package miscellaneous;

import java.util.Scanner;

public class Reverse {

public static void main(String[] args) {
        
        int rev=0, num, n;
        
      System.out.println("Enter the number to be reversed: ");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      num=n;
      
      while( n != 0 )
      {
          rev = rev * 10;
          rev = rev + n%10;
          n = n/10;
      }
 
      System.out.println("Reverse of" + num + " is "+rev);
   }
      
        
    }
    
