package arrays;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		int i,j,sum=0;
	     float avg;
	        Scanner sc=new Scanner(System.in);
	        int a[]=new  int[10];
	        System.out.println("Enter 10 elements into array:");
	        
	        for(i=0;i<10;i++){
	            
	            a[i]=sc.nextInt();
	            sum=sum+a[i];
	            
	        }
	         System.out.println("Sum of all elements is"+sum);
	         avg= (float) sum/10;
	         System.out.println("Average is"+avg);
	        
	     }

	}


