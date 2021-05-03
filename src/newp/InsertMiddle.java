package newp;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertMiddle {

	public static void main(String[] args) {
		String s= "tom harry";
		String s1= "dick";
		int count=0;
	ArrayList<Object> arraylist = new ArrayList<>();
	Scanner sc = new Scanner(s);
	Scanner sc1= new Scanner(System.in);
	System.out.print("enter the position");
	int input= sc1.nextInt();
	
	do{
		
		if(count==input)
		{
			System.out.print(count);
			arraylist.add(s1+" ");
			}
		else
		{
			arraylist.add(sc.next()+" ");
		}
		++count;
	}while(sc.hasNext());
	
	for(Object b:arraylist)
	{
		System.out.print(b);
	}


	}

}
