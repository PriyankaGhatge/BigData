package arrays;

import java.util.Scanner;

public class Array1 {
	
	public static void main(String[] args) {
	
	 int i,j,temp;
     Scanner sc=new Scanner(System.in);
     int a[]=new  int[10];
     System.out.println("Enter 10 elements into array:");
     
 
     for(i=0;i<10;i++){
    
         a[i]=sc.nextInt();
     
     }
     
     
     for (i = 0; i < 10; i++) {
         for (j = i+1; j < 10 ; j++) {
             if (a[i] > a[j]) {

                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         }
     }
     System.out.println("Ascending order:");
     for (i = 0; i < 9; i++) {
         System.out.println(a[i] + ",");
     }
     System.out.println(a[10-1]);
 }
 

}
