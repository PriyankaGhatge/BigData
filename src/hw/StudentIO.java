package hw;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentIO {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		String names[]= {"Anupama","Sweta","Ajay","Atul"};
		int ages[] = {12,13,15,14};
		float fees[] = {2100f,1800f,2500f,2000f};
		char genders[]={'F','F','M','M'};
		
		
		try {
		DataOutputStream dob = new DataOutputStream(new FileOutputStream("D:\\JavaIO\\hw1.txt"));
		
		
		
		for(int i=0;i<fees.length;i++){
			
			dob.writeUTF(names[i]);
			dob.writeChar('\t');
			
			dob.writeInt(ages[i]);
			dob.writeChar('\t');
			
			dob.writeFloat(fees[i]);
			dob.writeChar('\t');
			
			dob.writeChar(genders[i]);
			dob.writeChar('\t');
			
			
		}
		
		DataInputStream doi = new DataInputStream(new FileInputStream("D:\\JavaIO\\hw1.txt"));
		
		
		while(true){
			
			float fee = doi.readFloat();
			doi.readChar();
			System.out.println(fee);
			
			int age = doi.readInt();
			doi.readChar();
			System.out.println(age);
			
			String name = doi.readUTF();
			doi.readChar();
			System.out.println(name);
			
			char gender = doi.readChar();
			doi.readChar();
			System.out.println(gender);
			
			for(int i=0;i<fees.length;i++){
			System.out.println("Students are:"+name);
			System.out.println("Student's age are:"+age);
			System.out.println("Student's gender are:"+gender);
			System.out.println("Student's fees are:"+fee);
			}
			
		}
		
			}
		catch (IOException e) {
				
				System.out.println("Exception ocurred is :"+e.getMessage());
			}
			
		}
		
	}



