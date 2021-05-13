package newp;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge4 {

	public static void main(String[] args) {
	String a[]=	{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
     	String b= "";
     	String b1="";
    	String s= "";
    	String con="";
    	String con1="";
     	ArrayList<Object> arr1= new ArrayList<>();
     	ArrayList<Object> arr2= new ArrayList<>();
     	ArrayList<Object> arr3= new ArrayList<>();
     	ArrayList<Object> arr4= new ArrayList<>();
  
     		
     		arr1.add(a[0]) ;
     		arr3.add(a[1]) ;
     		
     	Object ss[]=	arr1.toArray();
     	Object ss1[]=   arr3.toArray();
     	// for string  1 to 13 first array
     	for(int i=0;i<=ss.length-1;i++)
     	{
     		b=b+ss[i];
     		
    	}
     	
     	// for string  1 to 15 second array
     	for(int i=0;i<=ss1.length-1;i++)
     	{
     		b1=b1+ss1[i];
     		
    	}
     // for first set of array	
     	Scanner sc = new Scanner(b);
     	
     	while(sc.hasNext())
     	{
      con=	sc.next();
     con=  con.replace(",","");
     
     		arr2.add(con);
     	}
     	
        // for second  set of array	
     	Scanner sc1 = new Scanner(b1);
     	
     	while(sc1.hasNext())
     	{
      con1=	sc1.next();
     con1=  con1.replace(",", "");
     
     		arr4.add(con1);
     	}
     		
     		
//print first list of array
     	for(int i=0;i<=arr2.size()-1;i++)
     	{
    // 		System.out.println(arr2.get(i));
     	}
     	//print second  list of array
     	for(int i=0;i<=arr4.size()-1;i++)
     	{
    // 		System.out.println(arr4.get(i));
     	}
     	
     	for(int k=0;k<=arr2.size()-1;k++)
     	{
     		for(int l=0;l<=arr4.size()-1;l++)
     		{
     			if(arr2.get(k).equals(arr4.get(l)))
     			{
     				System.out.println(arr2.get(k));
     			}
     		}
     	}
     	

	}

}
