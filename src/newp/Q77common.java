package newp;

import java.util.ArrayList;

public class Q77common {
	 
					


public static void main(String ar[])
{
	int a[]= {50, -20, 0} ;
	int b[]= {5, -50, 10}  ;
	ArrayList<Integer> array= new ArrayList<>();
	
	for(int i=0;i<=a.length-1;i++)
	{
		if(i==0)
		{
			array.add(a[i]);
			break;
		}
	}
	
	for(int i=0;i<=b.length-1;i++)
	{
		if(i==b.length-1)
		{
			array.add(b[i]);
			break;
		}
	}
	
	for(Integer gg: array)
	{
	System.out.println(gg);	
	}
	
}

}

