package hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInput1 {

	public static void main(String[] args)  {
	
		
		String name[]= new String[3];
		int id[]= new int[3];
		int age[]= new int[3];
		float fees[]= new float[3];
		
		Scanner s = new Scanner(System.in);
		
		for(int a=0;a<3;a++){
			
			System.out.println("Enter name:");
		    name[a]=s.next();
			System.out.println("Enter id:");
			id[a]=s.nextInt();
			System.out.println("Enter age:");
			age[a]=s.nextInt();
			System.out.println("Enter fees:");
			fees[a]=s.nextFloat();
			
		}
		s.close();
		
		try {
			FileWriter fr = new FileWriter("D:\\JavaIO\\UserStudent.txt");
			
			for(int a=0;a<3;a++){
				
				fr.write("Name is:"+name[a]+", ID is:"+id[a]+" , Age is:"+age[a]+" , Fees are:"+fees[a]+"\n");
				
			}
			fr.close();
			
			 FileReader fw = new FileReader("D:\\JavaIO\\UserStudent.txt");
	           BufferedReader br = new BufferedReader(fw);
	           String data;           
	           while((data=br.readLine())!=null){
	             System.out.println(data);
	        }
	           
	           System.out.println("Ages above 18");
	            for(int value:age){
	            	if(value>18)
	             System.out.println(value);
	                  
	            }
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		}
		
		
	}
