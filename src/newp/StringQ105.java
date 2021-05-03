package newp;

import java.util.Scanner;

public class StringQ105 {

	public static void main(String[] args) {
		String a = "abcd abc aabc baa abcaa";
		int count =0;
		Scanner sc = new Scanner(a);
		if(a.length()!=0)
		{
			while(sc.hasNext())
			{
				
				if(sc.next().contains("aa"))
				{
					count++;
				}
			}
			
		}
		
		else
		{
			System.out.println("string is empty");
		}
		
System.out.println("a appears in "+ " " + count);
	}

}
