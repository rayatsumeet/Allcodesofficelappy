package newp;

import java.util.ArrayList;

public class AddDollars {

	public static void main(String[] args) {
		String a = "tomorrow";
		ArrayList<Object> arrayl = new ArrayList<>();
		int count =0;
		for(int i=0;i<=a.length()-1;i++)
		{
			if(a.charAt(i)=='o')
			{
				for(int j=0;j<=count;j++)
				{
					arrayl.add("$");
				}
				count++;
			}
			
			else
			{
				arrayl.add(a.charAt(i));
			}
		}
		
		for(Object ss:arrayl)
		{
			System.out.print(ss);
		}

	}

}
