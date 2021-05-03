
public class duplicatestringcount {
	
	public static void main(String ar[])
	{
		
		String a = "sumeet   rayat";
		int count=0;
		
try {
		for(int i=0;i<=a.length();i++)
		{
			
			for(int j=i+1;j<a.length();j++)
			{
				
				if(String.valueOf(a.charAt(i)).equals(String.valueOf(a.charAt(j))))
				{
					count++;
					break;
					 
				}
				
			}
		}
		
		System.out.println(count);
		
}

catch(Exception e)
{
	e.printStackTrace();
}
		
		
	}

}
