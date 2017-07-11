package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			
			FileOutputStream fob= new FileOutputStream("D:\\JavaIO\\Example1.txt");
			ObjectOutputStream ob = new ObjectOutputStream(fob);
			ob.writeObject(new Date());
			ob.writeBoolean(true);
			ob.writeFloat(54.23f);
			
			Student s =  new Student();
			s.setStdName("Rahul");
			s.setStdAge(12);
			
			Student s1 =  new Student();
			s1.setStdName("Rohini");
			s1.setStdAge(14);

			Course c = new Course();
			c.setCrsName("Java DevOps");
			
			Course c1 = new Course();
			c1.setCrsName("Big Data Hadoop");
			
			List<Student> l1 = new ArrayList<Student>();
			l1.add(s);
			
			List<Student> l2 = new ArrayList<Student>();
			l1.add(s1);
			
			
			
			c.setStdDetails(l1);
			c1.setStdDetails(l2);
			
			ob.writeObject(c);
			ob.writeObject(c1);
					
			ObjectInputStream obj = new ObjectInputStream(new FileInputStream("D:\\JavaIO\\Example1.txt"));
			
			Date d = (Date) obj.readObject();
			boolean b = obj.readBoolean();
			float f = obj.readFloat();
			
			System.out.println("Date is:"+d);
			System.out.println("Boolean value is:"+b);
			System.out.println("Float value is:"+f);
			
			Course cin = new Course();
			
			
			cin=(Course) obj.readObject();
			
			System.out.println(cin.getCrsName());
			System.out.println(cin.getStdDetails());
			
			Student sc =cin.getStdDetails().get(1);
			
			System.out.println(sc.getStdName());
			System.out.println(sc.getStdAge());
			
		}
		
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		} 
		
		catch (IOException e) {
			System.out.println("Exception occured"+e.getMessage());
		}

	}

}
