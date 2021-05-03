package newp;

import java.util.Arrays;
import java.util.Scanner;

public class StrinhendswithMorN {

	public static void main(String[] args) {
		String a = "mam is in the room";
		int countm=0;
		int countn=0;
		Scanner sc = new Scanner(a);
	
	while(sc.hasNext())
	{
	//	System.out.println(sc.next());
	        String s=    sc.next();
	        System.out.println(s);
	        if(s.endsWith("m"))
	        {
	        	countm++;
	        }
	        if(s.endsWith("n"))
	        {
	        	countn++;
	        }
	}
			
			
	System.out.println("count of m is"+" " +countm);
	System.out.println("count of n is"+" " +countn);
	
	

	}

}
