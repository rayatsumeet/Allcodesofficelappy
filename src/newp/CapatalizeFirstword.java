package newp;

import java.util.Scanner;

public class CapatalizeFirstword {

	public static void main(String[] args) {
		String s = "the quick brown fox jumps over the lazy dog.";
		
	Scanner sc = new Scanner(s);
	
	while(sc.hasNext())
	{
	String next= 	sc.next();
 String a1= 	next.substring(0,1).toUpperCase();
 String a2= next.substring(1);
 String a3= a1+a2;
 
 System.out.println(a3);
	
	
	}

	
	}

}
