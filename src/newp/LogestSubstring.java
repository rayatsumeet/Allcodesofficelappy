package newp;

import java.util.Scanner;

public class LogestSubstring {
	/*Input: "fun&!! time"
	Output: time */
	public static void main(String[] args) {
		
    String a = "funnnn time yoooooo dddddddd";
    int count=0;
    int max=0;
    String finall="";
    Scanner sc = new Scanner(a);
    
    while(sc.hasNext())
    {
    	String ss= sc.next();
    	count=0;
    	for(int i=0;i<=ss.length()-1;i++) {
    	if(ss.charAt(i)>=97 && ss.charAt(i)<=122)
    	{
    		count++;
    		   
    	    
    	}
    	
    	}
    	if(count>max)
    	{
    	max=count;
    	  finall=  ss;
    	
    		
    	}
    }
    
    System.out.print(max+" "+finall);
    
    
    
	}

}
