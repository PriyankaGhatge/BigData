package javaIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		float prices[] = {4.36f,9.89f};
		int units[] = {10,5};
		String description[]= {"Blue","Red"};
		
		
		try {
		DataOutputStream d = new DataOutputStream(new FileOutputStream("D:\\JavaIO\\Example2.txt"));
		
		for(int i=0;i<prices.length;i++){
			
			d.writeFloat(prices[i]);
			d.writeChar('\t');
			
			d.writeInt(units[i]);
			d.writeChar('\t');
			
			d.writeUTF(description[i]);
			d.writeChar('\t');
			
		}
		
		DataInputStream di = new DataInputStream(new FileInputStream("D:\\JavaIO\\Example2.txt"));
		
		float total=0;
		while(true){
			
			float price = di.readFloat();
			di.readChar();
			System.out.println(price);
			
			int unit = di.readInt();
			di.readChar();
			System.out.println(unit);
			
			String des = di.readUTF();
			di.readChar();
			System.out.println(des);
			
			System.out.println("Order is made of"+unit+"units of"+des+"at a price of Rs."+price);
			
			total= total+(unit*price);
			
			System.out.println("Total is:"+total);
		}
		
			}
		catch (IOException e) {
				
				System.out.println("Exception ocurred is :"+e.getMessage());
			}
		
		
			
		}
		
	}


