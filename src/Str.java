import java.util.ArrayList;
import java.util.HashSet;

public class Str {
//static int a;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 most repeating character
		String s="sumeet";	
		
	char a[]=	s.toCharArray();
	
	int count =0;
	HashSet<Object> h = new HashSet<Object>();
	
	for(int i=0;i<=a.length-1;i++)
	{
		
		if(h.contains(a[i]))
		{
			System.out.println("repeating"+a[i]);

		}
		else
		{
			h.add(a[i]);
		}
	}
			
				



	}

}
