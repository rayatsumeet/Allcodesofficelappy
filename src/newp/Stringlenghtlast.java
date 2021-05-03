package newp;

import java.util.ArrayList;
import java.util.Scanner;

public class Stringlenghtlast {

	public static void main(String[] args) {
		String a = "this is sumeet ddddddddsfsdfdd";
		ArrayList<String> arraya = new ArrayList<>();
		
		
		Scanner sc= new Scanner(a);
		
		while(sc.hasNext())
		{
		String dd= 	sc.next();
			arraya.add(dd);
		}
		
		for(int i=0;i<=arraya.size()-1;i++)
		{
			if(i==arraya.size()-1) {
				System.out.println(arraya.get(i));
		System.out.println(arraya.get(i).length());
			}
		}
			
		

	}

}
