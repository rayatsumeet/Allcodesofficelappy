package newp;

import java.util.ArrayList;

public class AppendScreen {

	public static void main(String[] args) {
		
		String a= "sumeet";
		String con="";
		
		ArrayList<Object> al = new ArrayList<>();
		al.add(a);
		
		for(int i=a.length()-3;i<=a.length()-1;i++)
		{
		
			//System.out.print(a.charAt(i));	
		con = con+ a.charAt(i);
			
		}
		
		al.add(0, con);
		al.add(al.size(), con);
		
		for(Object h:al)
		{
		System.out.print(h);	
		}
		

	}

}
