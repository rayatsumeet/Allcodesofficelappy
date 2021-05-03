package newp;

import java.util.ArrayList;

public class input {

	public static void main(String[] args) {
		String a="s8s9w2";
		
		ArrayList<Object> arraylist = new ArrayList<>();
	
		for(int i=0;i<=a.length()-1;i++)
		{
			System.out.println(i);
			char num= a.charAt(i);
			char count= a.charAt(i+1);
		 int count1=   Character.getNumericValue(count);
			
			for(int j=0;j<=count1-1;j++)
			{
				arraylist.add(num);
				
			}
			
			i=i+1;
			System.out.println(i);
		}
		
		for(Object b:arraylist)
		{
			System.out.print(b);
		}

	}

}
