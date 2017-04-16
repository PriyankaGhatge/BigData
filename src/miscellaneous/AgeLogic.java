package miscellaneous;

import java.util.Scanner;

public class AgeLogic {
	

    String stdName;
    int StdAge;
    int i=0;
    int total=0;
	private Scanner s;

    public void acceptandcheck()
    {
    s = new Scanner(System.in);
    
        
    while(i<3)
    {
        System.out.println("Enter Student Name: ");
        stdName = s.next();
        
        System.out.println("Enter Student Age: ");
        StdAge = s.nextInt();
        
        if(StdAge>18)
        {
            total=total+1;
                
        }
    i++;
    }
        
    }
    
    public void display()
    {
     System.out.println("Total students eligible:" + total);
    }   

	public static void main(String[] args) {
		
		 AgeLogic a = new AgeLogic();
	        a.acceptandcheck();
	        a.display();
	        
	}

}
